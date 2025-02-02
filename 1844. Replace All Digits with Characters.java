class Solution {
    public String replaceDigits(String s) {
        String res="";
        if(s.length()%2==0){
            for(int i=0;i<s.length();i+=2){
                res=res+s.charAt(i);
                int s1=(int)(s.charAt(i+1));
                res=res+(char)(s.charAt(i)+s1-48);
            }
        }else{
            for(int i=0;i<s.length()-1;i+=2){
                res=res+s.charAt(i);
                int s1=(int)(s.charAt(i+1));
                res=res+(char)(s.charAt(i)+s1-48);
            }
            res+=s.charAt(s.length()-1);
        }
        return res;
        
    }
}
