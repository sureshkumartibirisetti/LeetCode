class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int a=Integer.bitCount(i);
            if(isprime(a)){
                count++;
            }
        }
        return (count);
    }
    static boolean isprime(int a){
        if(a<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
