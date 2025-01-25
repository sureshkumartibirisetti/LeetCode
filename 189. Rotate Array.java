class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        int a=k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,a-1);
        reverse(nums,a,l-1);

    }
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
