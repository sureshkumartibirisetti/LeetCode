class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char ch : bucket[i]) {
                    for (int j = 0; j < i; j++) {  
                        result.append(ch);
                    }
                }
            }
        }
        return (result.toString());
    }
}
