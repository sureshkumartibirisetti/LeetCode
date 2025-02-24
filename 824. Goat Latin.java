class Solution {
    public String toGoatLatin(String sentence) {
        String[] s = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while(idx < s.length)
        {
            String word = s[idx];
            StringBuilder wordBuilder = new StringBuilder(word);
            // If start with vowel
            char c = word.charAt(0);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                wordBuilder.append("ma");
            }
            // If start with consonant
            else
            {
                wordBuilder.deleteCharAt(0);
                wordBuilder.append(c).append("ma");
            }
            // Add a based on idx
            int cnt = idx;
            while(cnt >= 0)
            {
                wordBuilder.append("a");
                cnt--;
            }
            
            if (sb.length() != 0)
            {
                sb.append(" ");
            }
            sb.append(wordBuilder);

            idx++;
        }

        return sb.toString();
    }
}
