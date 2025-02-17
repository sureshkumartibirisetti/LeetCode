class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        HashMap<Character,String> hm=new HashMap<>();
        if(arr.length!=pattern.length()){
            return false;
        }else{
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String ss=arr[i];
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(ss)){
                    return false;
                }
            }else if(hm.containsValue(ss)){
                return false;
            }
            else{
                hm.put(ch,arr[i]);
            }
        }
        }
        return true;
    }
}
