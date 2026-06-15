class Solution:
    def flipAndInvertImage(self, nums: List[List[int]]) -> List[List[int]]:
        for i in range(len(nums)):
            nums[i].reverse()
        for i in range(len(nums)):
            for j in range(len(nums[i])):
                if (nums[i][j]==0):
                    nums[i][j]=1
                else:
                    nums[i][j]=0
        return nums