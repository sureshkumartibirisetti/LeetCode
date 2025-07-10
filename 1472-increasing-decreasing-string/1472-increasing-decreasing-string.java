class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        int a=0;
        while(a!=l) {
            for (char i = 'a'; i <= 'z'; i++) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    map.put(i,map.get(i)-1);
                    sb.append(i);
                    a++;
                }
            }
            for(char i='z';i>='a';i--){
                if(map.containsKey(i) && map.get(i) > 0) {
                    map.put(i,map.get(i)-1);
                    sb.append(i);
                    a++;
                }
            }
        }
        return (sb.toString());
    }
}