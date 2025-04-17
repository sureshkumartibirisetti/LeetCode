class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        int j=1;
        while(j!=s.length()){
            List<Integer> list=new ArrayList<>();
            char ch=s.charAt(i);
            char ch1=s.charAt(j);
            if(ch==ch1 && j!=s.length()-1){
                j++;
            }
            else if(ch==ch1 && j==s.length()-1){
                if(j-i+1>=3){
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
                i=j;
                j=j+1;
            }
            else{
                if(j-i>=3){
                    list.add(i);
                    list.add(j-1);
                    res.add(list);
                }
                i=j;
                j=j+1;

            }

        }
        return res;
    }
}
