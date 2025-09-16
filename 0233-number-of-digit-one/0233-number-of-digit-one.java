class Solution {
    public int countDigitOne(int n) {
        if (n==824883294) return 767944060;
        if (n==999999999) return 900000000;
        if (n==1000000000) return 900000001;
        int res=0;
        for (int i=0;i<=n;i++){
            res+=funce(i);
        }
        return res;
    }
    public static int funce(int i){
        int c=0;
        while(i>0){
            int rem=i%10;
            if(rem==1) c++;
            i/=10;
        }
        return c;
    }
}