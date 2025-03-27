class Solution {
    public int alternateDigitSum(int n) {
        int a=0;
        int b=0;
        String temp=Integer.toString(n);
        for(int i=1;i<temp.length();i+=2){
            b-=temp.charAt(i)-'0';
            a+=temp.charAt(i-1)-'0';
        }
        if(temp.length()%2!=0){
            a+=temp.charAt(temp.length()-1)-'0';
        }
        return a+b;
    }
}
