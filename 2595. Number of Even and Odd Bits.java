class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if(j%2==0){
                    even++;
                    j++;
                }else{
                    odd++;
                    j++;
                }
            }else{
                j++;
            }
        }
        return (new int[]{even,odd});
    }
}
