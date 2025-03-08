class Solution {
    public int countCharacters(String[] words, String chars) {
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(String i:words){
            HashMap<Character,Integer> temp=new HashMap<>();
            for(int j=0;j<i.length();j++){
                temp.put(i.charAt(j),temp.getOrDefault(i.charAt(j),0)+1);
            }
            int a=0;
            for(int j=0;j<i.length();j++){
                char ch=i.charAt(j);
                if(map.containsKey(ch) && temp.containsKey(ch)){
                    if(map.get(ch)>=temp.get(ch)){
                        a++;
                    }else{
                        a=0;
                        break;
                    }
                }else{
                    a=0;
                    break;
                }
            }
            if(a>0){
                res+=i.length();
            }
        }
        return res;
    }
}
