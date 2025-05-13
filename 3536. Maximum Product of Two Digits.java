class Solution {
    public int maxProduct(int n) {
        int f1=0;
        int f2=0;
        while(n>0){
            int temp=n%10;
            if(temp>=f1){
                f2=f1;
                f1=temp;
            }
            else if(temp<f1 && temp>f2){
                f2=temp;
            }
            n/=10;
        }
        return (f1*f2);
    }
}
