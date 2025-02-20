class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int res=0;
        for(int i:nums){
            res+=digit(i);
        }
        return res;
        
    }
    public static int digit(int i){
        int max=0;
        int c=0;
        if(i==1000){
            return 1111;
        }
        while(i>0){
            int temp=i%10;
            if(max<temp){
                max=temp;
            }
            c++;
            i/=10;
        }
        if(c==1){
            return max;
        }else if(c==2){
            return max*11;
        }
        return max*111;
    }
}
