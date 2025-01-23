class Solution {
    public String decodeMessage(String key, String message) {
        String res="";
        HashMap<Character,Character> hp=new HashMap<>();
        int j=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(hp.containsKey(ch)) continue;
            else if(ch==' ') continue;
            else{
                hp.put(ch,(char)(j));
                j++;
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' ') res+=' ';
            else res+=hp.get(message.charAt(i));
        }
        return res;
    }
}
