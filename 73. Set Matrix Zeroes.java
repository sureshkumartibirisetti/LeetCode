class Solution {
    public void setZeroes(int[][] arr) {
        int[] row=new int[arr.length];
        int[] col=new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
