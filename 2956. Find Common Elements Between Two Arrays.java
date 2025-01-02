class Solution {
    public int[] findIntersectionValues(int[] num1, int[] num2) {
        int[] res=new int[2];
        int ans1=0;
        int ans2=0;
        for(int i: num1){
            for(int j:num2){
                if(i==j){
                    ans1++;
                    break;
                }
            }
        }
        for(int i:num2){
            for(int j:num1){
                if(i==j){
                    ans2++;
                    break;
                }
            }
        }
        res[0]=ans1;
        res[1]=ans2;
        return res;
    }
}
