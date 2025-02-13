class Solution {
    public String generateTheString(int n) {
        char[] ch=new char[n];
        Arrays.fill(ch,'a');
        if(n%2==0){
            ch[0]='b';
        }
        return new String(ch);
    }
}
