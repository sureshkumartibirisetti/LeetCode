class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=((26-(s.charAt(i)-97))*(i+1));
        }
        return sum;
    }
}
