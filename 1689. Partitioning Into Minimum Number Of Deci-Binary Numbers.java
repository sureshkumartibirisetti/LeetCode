class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char i:n.toCharArray()){
            int a=i-'0';
            if(a==9){
                return 9;
            } else if (max<a) {
                max=a;
            }
        }
        return max;
    }
}
