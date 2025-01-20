class Solution {
    public int balancedStringSplit(String s) {
        int l=s.length();
        int a=0;
        int b=0;
        int count=0;
        for(int i=0;i<l;i++){
            char ch = s.charAt(i);
            if(ch=='L'){
                a++;
            }else{
                b++;
            }if(a==b){
                count++;
            }
        }
        return count;
    }
}
