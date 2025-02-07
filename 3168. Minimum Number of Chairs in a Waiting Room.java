class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int s1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                c++;
            }else{
                c--;
            }
            if(c>s1){
                s1=c;
            }
        }
        return s1;
    }
}
