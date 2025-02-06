class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length-1;i++){
            String s=words[i];
            for(int j=i+1;j< words.length;j++){
                String s1=words[j];
                if(s.charAt(0)==s1.charAt(1) && s.charAt(1)==s1.charAt(0)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
