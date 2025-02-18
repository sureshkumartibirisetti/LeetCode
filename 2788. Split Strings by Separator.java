class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
       List<String> al=new ArrayList<>();
        for(String i:words){
            String[] arr=i.split("\\"+separator);
            for(String j:arr){
                if(j.length()>0){
                    al.add(j);
                }
            }
        }
        return al;
    }
}
