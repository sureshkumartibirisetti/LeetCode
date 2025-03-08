class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res=0;
        for(int i=low;i<=high;i++){
            int a=1+(int)(Math.floor(Math.log10(i)));
            if(a%2==0){
                if(sym(i)){
                    res++;
                }
            }
        }
        return res;

    }
    static boolean sym(int a){
        String s=String.valueOf(a);
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(i<(s.length()/2)){
                l+=s.charAt(i)-'0';
            }else{
                r+=s.charAt(i)-'0';
            }
        }
        return l==r;
    }
}
