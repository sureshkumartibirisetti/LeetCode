class Solution {
    public int maxCandies(int[] status,int[] candies,int[][] keys,int[][] containedBoxes,int[] initialBoxes) {

        int count=0; // Total candies collected
        boolean[] vis=new boolean[status.length]; // Track visited boxes
        for(int v:initialBoxes){
            dfs(v,status,keys,containedBoxes,vis);
        }

        for(int i=0;i<candies.length;i++){
            if(vis[i]&&status[i]==1){
                count+=candies[i];
            }
        }
        return count;
    }

    public void dfs(int v,int[] status,int[][] keys,int[][] containedBoxes,boolean[] vis){ 

        vis[v]=true; // Mark the current box as visited
        for(int vKey:keys[v]){
            if(vKey==v) continue; // Skip self-key
            status[vKey]=1; // Unlock the box
        }

        for(int vContained:containedBoxes[v]){
            if(!vis[vContained]){
                dfs(vContained,status,keys,containedBoxes,vis);
            }
        }
    }
}
