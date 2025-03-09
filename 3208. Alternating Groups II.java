class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] temp = new int[n + k - 1];
        System.arraycopy(colors, 0, temp, 0, n);
        System.arraycopy(colors, 0, temp, n, k - 1); 

        int count = 0;
        int left = 0;
        
        for (int right = 0; right < temp.length; right++) {
            if (right > 0 && temp[right] == temp[right - 1]) {
                left = right;  
            }
            
            if (right - left + 1 >= k) {
                count++;  
            }
        }
        
        return count;
    }
}
