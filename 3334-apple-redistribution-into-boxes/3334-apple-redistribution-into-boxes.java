class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total_apple=0;
        for(int i:apple){
            total_apple+=i;
        }
        int res=0;
        int temp=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            temp+=capacity[i];
            res++;
            if(total_apple<=temp){
                break;
            }
        }
        return res;
    }
}