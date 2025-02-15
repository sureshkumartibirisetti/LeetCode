class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if((a+d)<24){
            return a+d;
        }
        return (a+d)-24;
        
    }
}
