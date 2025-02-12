class Solution {
    public int countGoodRectangles(int[][] nums) {
        int max=0;
        int c=0;
        for(int[] i:nums){
             int s=Math.min(i[0],i[1]);
             if(s>max){
                max=s;
                c=1;
             }else if(s==max){
                c++;
             }
        }
        return c;
        

    }
}
