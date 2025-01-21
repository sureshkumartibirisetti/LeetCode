class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            int s=l-i;
            int e=i+1;
            int c=s*e;
            int t=c/2;
            if(c%2==1){
                t++;
            }
            res+=t*arr[i];
        }
        return res;
    }
}
