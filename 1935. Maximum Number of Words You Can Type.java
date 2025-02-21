class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int res=0;
        String[] arr= text.split(" ");
        for(String i:arr){
            int s=0;
            for(int j=0;j<brokenLetters.length();j++){
                if(i.contains(brokenLetters.charAt(j)+"")){
                    s=1;
                    break;
                }
            }
            if(s==0){
                res++;
            }
        }
        return res;
    }
}
