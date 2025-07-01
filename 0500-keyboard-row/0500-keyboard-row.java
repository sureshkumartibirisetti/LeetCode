class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String i:words){
            int c1=0;
            int c2=0;
            int c3=0;
            String s=i.toLowerCase();
            for(int j=0;j<i.length();j++){
                if(r1.contains(s.charAt(j)+"")){
                    c1++;
                }else if(r2.contains(s.charAt(j)+"")){
                    c2++;
                }else{
                    c3++;
                }
                if((c1>0 && c2>0)||(c2>0 && c3>0)||(c1>0 && c3>0)){
                    break;
                }
            }
            if(c1==i.length() || c2==i.length() || c3==i.length()){
                list.add(i);
            }
        }
        String[] array = list.toArray(new String[0]);
        return array;
    }
}