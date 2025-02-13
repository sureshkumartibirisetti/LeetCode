class Solution {
    public int minSteps(String s, String t) {
        int res=0;
        HashMap<Character, Integer> Hp1 = new HashMap<>();
        HashMap<Character, Integer> Hp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Hp1.put(ch, Hp1.getOrDefault(ch, 0) + 1);
            char ch1 = t.charAt(i);
            Hp2.put(ch1, Hp2.getOrDefault(ch1, 0) + 1);
        }
        for (Map.Entry<Character, Integer> i : Hp1.entrySet()) {
            char key = i.getKey();
            if (Hp2.containsKey(key)) {
                if (i.getValue().equals(Hp2.get(key))) {
                    res += i.getValue();
                } else {
                    res += Math.min(i.getValue(), Hp2.get(key));
                }
            }
        }

        return (s.length() - res);
    }
}
