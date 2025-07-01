class Solution {
    public String convertToBase7(int num) {
        if (num==0){
            return "0";
        }
        int temp=num;
        num=Math.abs(num);
        String res="";
        while(num!=0){
            int temp1=num%7;
            res=temp1+res;
            num/=7;
        }
        if(temp<0){
            res="-"+res;
        }
        return res;
    }
}