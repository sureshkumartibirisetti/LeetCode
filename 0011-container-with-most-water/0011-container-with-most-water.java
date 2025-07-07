class Solution {
    public int maxArea(int[] height) {
        int maxHeight=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int sum=Math.min(height[i],height[j]);
            int area=(j-i)*(sum);
            if(maxHeight<area){
                maxHeight=area;
            }
            if (height[i] < height[j]) {
                i++;
            }else{
                j--;
            }
        }
        return maxHeight;
    }
}