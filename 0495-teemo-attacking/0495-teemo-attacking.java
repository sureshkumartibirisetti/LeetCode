class Solution {
    public int findPoisonedDuration(int[] ts, int d) {
      int t=0;
      for(int i=0;i<ts.length-1;i++){
        int c=ts[i];
        int n=ts[i+1];
        if(n>=c+d){
            t=t+d;
        }else{
            t=t+(n-c);
        }
      }  
      t=t+d;
      return t;
    }
}