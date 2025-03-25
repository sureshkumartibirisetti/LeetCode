class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int a=n*n;
        int res=0;
        int res1=0;
        for(int i=1;i<=a;i++){
           res+=w;
           if(res>maxWeight){
               break;
           }else{
               res1+=1;
           }
        }
        return res1;
    }
}
