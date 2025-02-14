class Solution {
    public int sumBase(int n, int k) {
        int res=0;
        while(n>0){
            int temp=n%k;
            res+=temp;
            n=n/k;
        }
        return res;
        
    }
}
