class Solution {
    public List<String> stringSequence(String target) {
        List<String> res=new ArrayList<>();
        String org="";
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            for(char j='a';j<=ch;j++){
                res.add(org+j);
            }
            org+=ch;
        }
        return res;
    }
}