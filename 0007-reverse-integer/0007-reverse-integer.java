class Solution {
    public int reverse(int x) {
        long rev=0;
        int a=0;
        if(x<0){
            a=1;
            x=Math.abs(x);

        }
        while(x>0){
            int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
            

        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(a==0){
            return (int)rev;
        }else{
            return (int)rev*-1;
        }
        
    }
}