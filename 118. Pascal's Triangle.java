class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(gene(i));
        }
        return res;
        
    }
    static List<Integer> gene(int row){
        int ans=1;
        List<Integer> ans1=new ArrayList<>();
        ans1.add(ans);
        for(int i=1;i<row;i++){
            ans=(ans*(row-i))/i;
            ans1.add(ans);
        }
        return ans1;
    }
}
