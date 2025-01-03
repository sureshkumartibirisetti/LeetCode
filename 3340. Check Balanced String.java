class Solution {
    public boolean isBalanced(String s) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'0';
            if(i%2==0){
                sum1+=a;
            }else{
                sum2+=a;
            }
        }
        return sum1==sum2;
    }
}
