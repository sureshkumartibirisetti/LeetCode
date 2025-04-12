class Solution {
    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;  
        }
        return result;
    }

    public void generatePalindromes(char[] currentNumber, int index, List<String> validPalindromes, int k) {
        if (index >= (currentNumber.length + 1) / 2) {
            String palindrome = new String(currentNumber); 
            if (Long.parseLong(palindrome) % k == 0) {
                validPalindromes.add(palindrome);
            }
            return;
        }
        if (index != 0) {
            currentNumber[index] = '0';
            currentNumber[currentNumber.length - 1 - index] = '0'; 
            generatePalindromes(currentNumber, index + 1, validPalindromes, k);
        }

        for (char c = '1'; c <= '9'; c++) {
            currentNumber[index] = c;
            currentNumber[currentNumber.length - 1 - index] = c; 
            generatePalindromes(currentNumber, index + 1, validPalindromes, k);
        }
    }

    public long countGoodIntegers(int n, int k) {
        List<String> validPalindromes = new ArrayList<>();
        char[] basePalindrome = new char[n]; 
        Arrays.fill(basePalindrome, '0'); 
        generatePalindromes(basePalindrome, 0, validPalindromes, k);

        Set<String> uniquePatterns = new HashSet<>();
        for (String palindrome : validPalindromes) {
            int[] freq = new int[10]; 
            for (char ch : palindrome.toCharArray()) {
                freq[ch - '0']++; 
            }
            StringBuilder pattern = new StringBuilder();
            for (int f : freq) {
                pattern.append((char) ('a' + f)); 
            }

            uniquePatterns.add(pattern.toString());
        }

        long totalPermutations = factorial(n); 
        long totalValidPermutations = 0; 

        for (String pattern : uniquePatterns) {
            long permutations = totalPermutations;
            for (char ch : pattern.toCharArray()) {
                permutations /= factorial(ch - 'a');
            }

            if (pattern.charAt(0) != 'a') {
                int zeroCount = pattern.charAt(0) - 'a' - 1; 
                long invalidPerms = factorial(n - 1); 
                for (int j = 1; j < pattern.length(); j++) {
                    invalidPerms /= factorial(pattern.charAt(j) - 'a');
                }

                invalidPerms /= factorial(zeroCount); 
                permutations -= invalidPerms; 
            }

            totalValidPermutations += permutations; 
        }

        return totalValidPermutations;
    }
}
