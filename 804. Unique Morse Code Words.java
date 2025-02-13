class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int res=0;
        HashMap<String, String> hm = new HashMap<>() {{
            put("a", ".-");
            put("b", "-...");
            put("c", "-.-.");
            put("d", "-..");
            put("e", ".");
            put("f", "..-.");
            put("g", "--.");
            put("h", "....");
            put("i", "..");
            put("j", ".---");
            put("k", "-.-");
            put("l", ".-..");
            put("m", "--");
            put("n", "-.");
            put("o", "---");
            put("p", ".--.");
            put("q", "--.-");
            put("r", ".-.");
            put("s", "...");
            put("t", "-");
            put("u", "..-");
            put("v", "...-");
            put("w", ".--");
            put("x", "-..-");
            put("y", "-.--");
            put("z", "--..");
        }};
        HashSet<String> hs=new HashSet<>();
        for(String i:words){
            String s="";
            for(int j=0;j<i.length();j++){
                s+=hm.get(i.charAt(j)+"");
            }
            hs.add(s);

        }
        return hs.size();
    }
}
