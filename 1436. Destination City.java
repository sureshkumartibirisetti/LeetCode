class Solution {
    public String destCity(List<List<String>> list) {
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<list.size();i++){
            List<String> s=list.get(i);
            map.put(s.get(0),map.getOrDefault(s.get(0),0)+1);
        }
        for(List<String> i:list){
            if(!map.containsKey(i.get(1))){
               return i.get(1);
            }
        }
        return "";
    }
}
