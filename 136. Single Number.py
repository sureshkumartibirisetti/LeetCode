class Solution(object):
    def singleNumber(self, nums):
        res = 0
        for x in nums:
            res ^= x
        return res
