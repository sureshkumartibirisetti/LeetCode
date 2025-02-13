class Solution {
    public int minSteps(String s, String t) {
        int[] counts = new int[26];
        for(char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        for(char ch : t.toCharArray()) {
            counts[ch - 'a']--;
        }
        int total = 0;
        for(int count : counts) {
            total += Math.abs(count);
        }

        return (total / 2) + (total % 2);
    }
}
