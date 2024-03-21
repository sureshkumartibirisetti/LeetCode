class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr=new int[nums.length];

        for (int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int fal = nums.length;      
        int sal = arr.length;   
        int[] result = new int[fal + sal]; 
        System.arraycopy(nums, 0, result, 0, fal);  
        System.arraycopy(arr, 0, result, fal, sal); 
        Arrays.toString(result); 
        return result;    
    }
}
