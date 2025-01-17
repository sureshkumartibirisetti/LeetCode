class Solution {
    public int minElement(int[] nums) {
        int res=Integer.MAX_VALUE;
         for(int i:nums){
             int s=MinEle(i);
             if(res>s){
                 res=s;
             }
         }
        return res;
    }
    static int MinEle(int i){
        int s=0;
        while(i>0){
            int rem=i%10;
            s+=rem;
            i/=10;
        }
        return s;
    }

}
