class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                 nums[j]=nums[i];
                 j+=1;
            }

        }
        return j;
        
    }
}
//  def removeDuplicates(self, nums: List[int]) -> int:
//         j=1
//         for i in range(1,len(nums)):
//             if nums[i]!=nums[i-1]:
//                 nums[j]=nums[i]
//                 j+=1
//         return j