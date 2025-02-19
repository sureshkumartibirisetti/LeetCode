class Solution {
    public boolean checkSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum%2==0;
    }
    public int countEven(int n) {
        int c=0;
        for(int i=2;i<=n;i++){
            if(checkSum(i)){
                c++;
            }
        }
        return c;
    }
}
