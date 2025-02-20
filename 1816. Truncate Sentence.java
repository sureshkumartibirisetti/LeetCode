class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String res="";
        for(int i=0;i<k;i++){
            res+=arr[i]+" ";
        }
        return res.trim();
    }
}
