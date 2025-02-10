class Solution {
    public String clearDigits(String str) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                s.add(str.charAt(i));
            }else{
                s.pop();
            }
        }
        String res="";
        for(int i=0;i<s.size();i++){
            res+=s.get(i);
        }
        return res;
    }
}
