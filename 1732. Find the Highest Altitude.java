class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int count=0;
        for (int i=0;i<gain.length;i++){
            alt+=gain[i];
            if(count<alt){
                count=alt;
            }
        }
        return count;
        
    }
}
