class Solution {
    public int[] minCosts(int[] cost) {
         int min=cost[0];
        for(int i=0;i<cost.length;i++){
            if(cost[i]<min){
                min=cost[i];
            }
            cost[i]=min;
        }
        return cost;
    }
}
