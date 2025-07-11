class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        int j=0;
        for(int i:map.values()){
            if(j<i) j=i;
        }
        if(j==1){
            return 1;
        }
        for(int i: map.keySet()){
            if(map.get(i)==j) list.add(i);
        }
        int res=Integer.MAX_VALUE;
        for(int i:list){
            int a=0;
            int b=nums.length-1;
            int l=0,lv=0;
            int r=0,rv=0;
            while(a<b){
                if(nums[a]==i && l==0){
                    l++;
                    lv=a;
                    a-=1;
                }if(nums[b]==i && r==0){
                    r++;
                    rv=b;
                    b+=1;
                }
                if(l>=1 && r>=1){
                    break;
                }
                a++;
                b--;
            }
            if(res>(rv-lv+1)){
                res=rv-lv+1;
            }

        }
        return res;
    }
}