class Solution {
    public int countConsistentStrings(String str, String[] words) {
        int count=0;
        for(String j:words){
                String s=j;
                int c=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                for(int k=0;k<s.length();k++){
                    if(s.charAt(k)==ch){
                        c++;
                    }
                }
            }
            if(c==s.length()){
                count++;
            }
        }
        return count;
    }
}
