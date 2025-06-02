class Solution {
    public int smallestIndex(int[] arr) {
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(i==isCheck(arr[i])){
                res=i;
                break;
            }
        }
        return res;
    }
    static int isCheck(int a){
        int temp=0;
        while(a>0){
            int temp1=a%10;
            temp+=temp1;
            a/=10;
        }
        return temp; 
    }
}
