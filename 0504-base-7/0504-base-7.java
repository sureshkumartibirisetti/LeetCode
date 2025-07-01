class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        int tem=Math.abs(num);
        StringBuilder ans=new StringBuilder();
        while(tem!=0)
        {
            ans.append(tem%7);
            tem/=7;
        }
        if(num<0)ans.append("-");
        return ans.reverse().toString();
    }
}