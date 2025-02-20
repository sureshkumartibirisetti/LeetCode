class Solution {
    public int countAsterisks(String s) {
        String[] arr=s.split("\\|");
        int res=0;
        for(int i=0;i<arr.length;i+=2){
            String ss=arr[i];
            for(int j=0;j<ss.length();j++){
                if(ss.charAt(j)=='*'){
                    res++;
                }
            }
        }
        return res;
        
    }
}
