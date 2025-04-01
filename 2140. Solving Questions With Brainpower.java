class Solution {
    private long rec(int i,int[][] questions,long[] dp,int n)
    {
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        long take = questions[i][0] + rec(i+questions[i][1]+1,questions,dp,n);
        long dont = rec(i+1,questions,dp,n);

        return dp[i] = Math.max(take,dont);

    }
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp,-1);
        return rec(0,questions,dp,n);
    }
}
