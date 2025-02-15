class Solution {
    public int maxScore(String s) {
        int i=0;
        int j=s.length()-1;
        int res=0;
        while(i!=s.length()-1 && j!=0){
            int a=0;
            int b=0;
            for(int x=0;x<=i;x++){
                if(s.charAt(x)=='0'){
                    a++;
                }
            }
            for(int y=s.length()-1;y>i;y--){
                if(s.charAt(y)=='1'){
                    b++;
                }
            }
            if((a+b)>res){
                res=(a+b);
            }
            i++;
            j--;
        }
        return res;
    }
}
