class Solution {
    public String convertToTitle(int c) {
         StringBuilder sb=new StringBuilder();
         while(c>0){
            c--;
            sb.append((char)(c%26+'A'));
            c/=26;
        }
        return (sb.reverse().toString());
    }
}