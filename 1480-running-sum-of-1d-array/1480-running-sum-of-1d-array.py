class Solution:
    def runningSum(self, a: List[int]) -> List[int]:
        s=0
        for i in range(len(a)):
            s+=a[i]
            a[i]=s
        return a
        