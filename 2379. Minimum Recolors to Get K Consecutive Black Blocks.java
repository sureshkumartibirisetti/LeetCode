class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=Integer.MAX_VALUE;
        int l=blocks.length();
        for(int i=0;i<blocks.length();i++){
            if(l-i>=k){
                int min=0;
                for(int j=i;j<i+k;j++){
                   if(blocks.charAt(j)=='W'){
                       min++;
                   }
               }
               if(res>min){
                   res=min;
               }
            }else{
                break;
            }
        }
        return (res);
    }
}
