class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(res.length()<2){
                res.append(s.charAt(i));
            }else{
                if(res.charAt(res.length()-1)==s.charAt(i) && res.charAt(res.length()-2)==s.charAt(i)){
                    continue;
                }else{
                    res.append(s.charAt(i));
                }
            }
        }
        return (res.toString());
    }
}
