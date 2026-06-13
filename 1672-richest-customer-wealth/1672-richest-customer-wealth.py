class Solution:
    def maximumWealth(self, a: List[List[int]]) -> int:
        m=0
        for i in range(len(a)):
            b=sum(a[i])
            m=max(m,b)
        return m
        