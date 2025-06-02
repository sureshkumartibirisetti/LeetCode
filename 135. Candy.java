class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int cnt = 0;
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) candies[i] = 1;
        for (int i = 1; i < n; i++)
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i])
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            cnt += candies[i - 1];
        }
        return cnt + candies[n - 1];
    }
}
