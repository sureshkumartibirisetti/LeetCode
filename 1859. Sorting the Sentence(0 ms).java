class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] arr = new String[words.length];
        for(String word : words)
        {
            int idx = word.charAt(word.length()-1)-'0';
            String str = word.substring(0,word.length()-1);
            arr[idx-1] = str;
        }
        return String.join(" ",arr);
    }
}
