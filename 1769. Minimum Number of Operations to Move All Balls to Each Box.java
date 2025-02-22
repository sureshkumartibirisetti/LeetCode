class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int res=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    res+=Math.abs(i-j);
                }
            }
            arr[i]=res;
        }
        return arr;
    }
}
