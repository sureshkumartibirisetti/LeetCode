class Solution {
    public double trimMean(int[] arr) {
         Arrays.sort(arr);
        int l= arr.length/20;
        double a=0;
        for(int i=0+l;i<arr.length-l;i++){
            a+=arr[i];
        }
        double s=a/(double) (arr.length-(l*2));
        return s;
    }
}
