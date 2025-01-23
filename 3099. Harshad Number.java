class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int b=0;
        while(x>0){
            int rem=x%10;
            b+=rem;
            x=x/10;
        }
        if(temp%b==0) return b;
        return -1;
    }
}
