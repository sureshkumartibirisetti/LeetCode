class Solution {
    public int[] replaceElements(int[] arr) {
        
        int pre = -1, val = -1; 

        for(int i = arr.length - 1; i >= 0; --i){

            pre = arr[i]; 
            arr[i] = val; 
            
            if(pre > val) val = pre; 

        }

        return arr;

    }
}
