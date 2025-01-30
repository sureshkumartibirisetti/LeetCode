class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        long ans=1;
        for(int i=1;i<=rowIndex;i++){
            long n=(ans*(rowIndex-i+1))/i;
            res.add((int)n);
            ans=n;
        }
        return res;
    }
}
