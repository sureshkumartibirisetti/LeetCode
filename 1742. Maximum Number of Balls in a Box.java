class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int a=isSum(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int result=0;
        for(int i:map.values()){
            if(i>result){
                result=i;
            }
        }
        return (result);
    }
    static int isSum(int i){
        int res=0;
        while(i>0){
            int temp=i%10;
            res+=temp;
            i/=10;
        }
        return res;
    }

}
