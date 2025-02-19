class Solution {
    public String[] uncommonFromSentences(String s, String ss) {
        String[] s1=s.split(" ");
        String[] s2=ss.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:s1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(String i:s2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        List<String> al=new ArrayList<>();
        for(String i:map.keySet()){
            if(map.get(i)==1) {
                al.add(i);
            }
        }
        String[] arr = al.toArray(new String[0]);
        return arr;
    }
}
