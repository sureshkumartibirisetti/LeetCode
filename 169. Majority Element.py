class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        a,b=0,0
        for i in nums:
            if b==0:
                a=i
                b+=1
            elif i==a:
                b+=1
            else:
                b-=1
        return a
