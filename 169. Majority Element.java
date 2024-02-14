class Solution {
    public int majorityElement(int[] nums) {
        int a=0;
        int b=0;
        for(int i:nums){
            if(b==0){
                a=i;
                b+=1;
            }else if(i==a){
                b+=1;
            }else{
                b-=1;
            }
        }
        return a;
        
    }
}
