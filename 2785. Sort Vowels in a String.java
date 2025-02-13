class Solution {
    public String sortVowels(String s) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            String ch1=ch.toLowerCase();
            if(ch1.equals("a")||ch1.equals("e")||ch1.equals("i")||ch1.equals("o")||ch1.equals("u")){
                al.add(ch);
            }
        }
        String res="";
        Collections.sort(al);
        int j=0;
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            String ch1=ch.toLowerCase();
            if(ch1.equals("a")||ch1.equals("e")||ch1.equals("i")||ch1.equals("o")||ch1.equals("u")){
                res+=al.get(j);
                j++;
            }else{
                res+=ch;
            }
        }
        return res;

        
    }
}
