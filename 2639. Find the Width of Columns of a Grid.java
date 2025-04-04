class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] res=new int[grid[0].length];
        for(int i=0;i< grid[0].length;i++){
            int temp=0;
            for(int j=0;j<grid.length;j++){
                int a=grid[j][i];
                if(a==0){
                    if(temp<1){
                        temp=1;
                    }
                }else{
                int b=(int)(1+Math.floor(Math.log10(Math.abs(a))));
                if(a<0){
                    if(temp<b+1){
                        temp=b+1;
                    }
                }else{
                    if(temp<b){
                        temp=b;
                    }
                }
                }
            }
            res[i]=temp;
        }
        return res;
    }
}
