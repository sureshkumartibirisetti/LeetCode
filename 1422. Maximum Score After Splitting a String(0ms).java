class Solution {
    public int maxScore(String s) {
        char[]c=s.toCharArray();
        int len=c.length-1, curOnes = 0, curZeros=0, max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(c[i]=='0'){
                curZeros++;
            }else{
                curOnes++;
            }
            max = Math.max(curZeros-curOnes, max);
        }
        if(c[len]=='1') curOnes++;

        return max+curOnes;
    }
}
