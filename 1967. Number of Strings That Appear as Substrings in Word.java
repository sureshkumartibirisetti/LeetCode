class Solution {
    public int numOfStrings(String[] p, String w) {
        int n=p.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            String str=p[i];
            if(w.contains(str))
            {
                c++;
            }
        }
        return c;
    }
}
