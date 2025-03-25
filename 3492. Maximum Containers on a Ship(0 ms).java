class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if((maxWeight/w)<=(n*n)){
            return maxWeight/w;
        }
        return n*n;
    }
}
