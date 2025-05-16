class Solution {
    public boolean differByOneChar(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++)
            if (word1.charAt(i) != word2.charAt(i))
                diffCount++;
        return diffCount == 1;
    }

    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = groups.length;
        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (groups[i] != groups[j] &&
                    differByOneChar(words[i], words[j]) &&
                    dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxi) maxi = dp[i];
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxi) {
                while (i != -1) {
                    result.add(words[i]);
                    i = parent[i];
                }
                break;
            }
        }
        Collections.reverse(result);
        return result;
    }
}
