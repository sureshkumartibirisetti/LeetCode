class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    arr[i]=arr[i]-arr[j];
                    break;
                }
            }
        }
        return arr;
        
    }
}
