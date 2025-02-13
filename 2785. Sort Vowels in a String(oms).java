class Solution {
    public String sortVowels(String s) {
        int[] vowelCount = new int[11];
        char[] vowels = "AEIOUaeiou".toCharArray();
        char[] letters = s.toCharArray();
        int[] indexToMap = new int[128];

        for(int i=0; i<vowels.length; i++) {
            indexToMap[vowels[i]] = i+1;
        }

        for(int i=0; i<letters.length; i++) {
            vowelCount[indexToMap[letters[i]]]++;
        }

        int i=0,j=1;
        while(j < vowelCount.length) {
            if(vowelCount[j] > 0) {
                while(i<letters.length) {
                    if(indexToMap[letters[i]] == 0) {
                        i++;
                        continue;
                    }
                    letters[i] = vowels[j-1];
                    i++;
                    vowelCount[j]--;
                    break;
                }
            } else {
                j++;
            }
        }
        return new String(letters);
    }
}
