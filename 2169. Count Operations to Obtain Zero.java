class Solution {
    public int countOperations(int num1, int num2) {
        int c=0;
        while(num1!=0 && num2!=0){
            if(num1>=num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
            c++;
        }
        return (c);
    }
}
