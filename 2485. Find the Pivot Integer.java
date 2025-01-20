class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int s1=((i)*(1+i))/2;
            int s2=((n-i+1)*(i+n))/2;
            if(s1==s2){
                return i;
            }
        }
        return -1;
    }
}
