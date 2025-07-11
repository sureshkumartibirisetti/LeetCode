class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        a = 0
        b = 1
        for i in nums:
            if i > 0:
                res[a] = i
                a += 2
            else:
                res[b] = i
                b += 2
        return res


        