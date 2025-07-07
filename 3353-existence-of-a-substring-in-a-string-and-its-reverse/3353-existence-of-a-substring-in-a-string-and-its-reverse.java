class Solution {
    public boolean isSubstringPresent(String s) {
        String reverse=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length()-1;i++)
        {
            String sub=s.substring(i,i+2);
            if(reverse.contains(sub))
            {
                return true;
            }
        }
        return false;
    }
}