class Solution {
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()-1;
        int a=0;
        int b=0;
        while(i<j){
            if("aeiouAEIOU".contains(s.charAt(i)+"")){
                a++;
            }if("aeiouAEIOU".contains(s.charAt(j)+"")){
                b++;
            }
            i++;
            j--;
        }
        return a==b;
        
    }
}
