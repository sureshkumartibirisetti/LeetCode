class Solution {
    public String largestOddNumber(String num) {
        int i=0;
        int j=num.length()-1;
        while(j>=0){
            int a=num.charAt(j)-'0';
            if(a%2!=0){
                return (num.substring(0,j+1));
            }
            if(a>i && a%2!=0){
                i=a;
            }
            j--;

        }
        if(i==0){
            return "";
        }
        return i+"";
        
    }
}
