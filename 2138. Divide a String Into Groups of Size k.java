class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] res=new String[(s.length()+k-1)/k];
        int a=0;
        for(int i=0;i<s.length();i++){
            if((i+k-1)<s.length()){
               res[a]=s.substring(i,i+k);
               a++;
               i=i+k-1;
            }else{
                String b=s.substring(i,s.length());
                for(int j=b.length();j<k;j++){
                    b+=fill;
                }
                res[a]=b;
                break;
            }
        }
        return res;
    }
}
