class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }
        int j=1;
        int r=0;
        int m=0;
        for(int i: hm.keySet()){
            int l=hm.get(i);
            if(l>1){
                r=i;
            }
            if(hm.containsKey(j)){
                j++;
            }else{
                m=j;
            }
        }
        if(m==0){
            m=j;
        }
        return new int[]{r,m}; 
    }
}
