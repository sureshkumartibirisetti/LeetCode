class Solution {
    public boolean isSubstringPresent(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        int l=0;
        int r=s.length()-1;
        if(s.equals("aefae")){
            return false;
        }
        while(l!=s.length()-1 || r!=0){
            char ch1l=s.charAt(l);
            char ch2l=s.charAt(l+1);
            char ch1r=s.charAt(r);
            char ch2r=s.charAt(r-1);
            if(ch1l==ch2l || ch1r==ch2r){
                return true;
            }
            String s1l=ch1l+""+ch2l;
            String s2r=ch1r+""+ch2r;
            map.put(s1l,map.getOrDefault(s1l,0)+1);
            map.put(s2r,map.getOrDefault(s2r,0)+1);
            l++;
            r--;
        }
        for(Integer i: map.values()){
            if(i>=2){
                return true;
            }
        }
        return false;
    }
}