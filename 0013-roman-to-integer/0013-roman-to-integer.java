class Solution {
    public int romanToInt(String s) {
        int res=0;
        int s1=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=s.length()-1;i>0;i--) {
            int l1=hm.get(s.charAt(i));
            int l2=hm.get(s.charAt(i-1));
            if(l1>l2){
                res+=l1-l2;
                i=i-1;
                s1+=2;
            }else{
                s1+=1;
                res+=l1;
            }

        }
        if(s1!=s.length()){
            res += hm.get(s.charAt(0));
        }
        
        return res;
    }
}