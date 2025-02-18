class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n%2==0){
            int j=0;
            for(int i=(n/2)*-1;i<=n/2;i++){
                if(i==0){
                    continue;
                }else{
                    arr[j]=i;
                    j++;
                }
            }
        }else{
            int j=0;
            for(int i=(n/2)*-1;i<=n/2;i++){

                    arr[j]=i;
                    j++;
            }
        }
        return arr;
    }
}
