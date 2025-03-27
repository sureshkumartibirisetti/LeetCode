class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character> set=new HashSet<>();
        int res=0;
        for(int i=0;i<word.length()-4;i++){
            set.clear();
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if("aeiou".contains(ch+"")){
                    set.add(ch);
                }else{
                    break;
                }
                if(set.size()==5){
                    res++;
                }
            }
        }
        return (res);
    }
}
