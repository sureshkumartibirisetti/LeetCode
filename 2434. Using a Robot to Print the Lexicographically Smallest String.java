import java.util.*;

class Solution {
    public String robotWithString(String s) {
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        StringBuilder t = new StringBuilder();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
            freq[ch - 'a']--;

            // Check if we can pop the top of the stack
            while (!stack.isEmpty() && stack.peek() <= smallestChar(freq)) {
                t.append(stack.pop());
            }
        }

        // Append remaining characters from stack
        while (!stack.isEmpty()) {
            t.append(stack.pop());
        }

        return t.toString();
    }

    // Helper function to find the smallest character still available
    private char smallestChar(int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                return (char) ('a' + i);
            }
        }
        return 'a';
    }
}
