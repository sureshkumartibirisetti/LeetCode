class Solution {
    public int countKeyChanges(String s) {
        String s1=s.toLowerCase();
        int l=s1.length();
        int i=0;
        int j=1;
        int count=0;
        while(i!=l && j!=l){
            if(s1.charAt(i)==s1.charAt(j)){
                j++;
            }
            else{
                count++;
                int temp=j;
                i=j;
                j=temp+1;
            }
        }
        return count;
    }
}
