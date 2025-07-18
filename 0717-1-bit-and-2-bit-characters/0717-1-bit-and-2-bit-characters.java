class Solution {
    public boolean isOneBitCharacter(int[] arr) {
        if(arr[arr.length-1]==1){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i]==0){
                    return true;
                }
            }else{
                if(arr[i]==1){
                    i+=1;
                }
            }
        }
        return false;
    }
}