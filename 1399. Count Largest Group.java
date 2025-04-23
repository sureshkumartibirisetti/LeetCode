class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int a=digitSum(i);

                map.put(a,map.getOrDefault(a,0)+1);

        }
        int a=0;
        for(int i:map.values()){
            if(i>a){
                a=i;
            }
        }
        int res=0;
        for(int j: map.values()){
            if(a==j){
                res++;
            }
        }
        return res;

    }
    
    static int digitSum(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            res+=temp;
            n/=10;
        }
        return res;
    }
}
