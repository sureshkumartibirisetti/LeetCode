class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        if(index==0 || index==arr.length-1){
            return false;
        }
        boolean a=true;
        boolean b=true;
        for(int j=0;j<index;j++){
            if(max<=arr[j]){
                a=false;
                break;
            }
            if(arr[j]<arr[j+1]){
            }else{
                a=false;
                break;
            }
        }
        for(int j=index+1;j<arr.length;j++){
            if(max<=arr[j]){
                b=false;
                break;
            }
            if(arr[j-1]>arr[j]){
            }else{
                b=false;
                break;
            }
        }
        if(a && b){
            return true;
        }
        return false;
        
    }
}
