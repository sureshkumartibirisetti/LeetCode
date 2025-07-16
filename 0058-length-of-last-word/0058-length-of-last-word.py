class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        res=""
        a=0
        for i in range(len(s)-1,-1,-1):
            if((s[i]>='a' and s[i]<='z') or (s[i]>='A' and s[i]<='Z')):
                res+=s[i]
                a+=1
            if(s[i]==' ' and a!=0):
                break
        return len(res)

        