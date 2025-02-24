class Solution {
    public List<String> stringMatching(String[] words) {
         String concat = String.join(" " , words);
        List<String> list = new ArrayList<>();

        for(int i =0; i < words.length; i++){
            if(concat.indexOf(words[i]) != concat.lastIndexOf(words[i])){
                    list.add(words[i]);
            }
        }
        return list;
    }
}
