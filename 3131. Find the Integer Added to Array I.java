class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
    return (minNum(nums2)-minNum(nums1));
    }
    public static int minNum(int[] arr){
        int min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
