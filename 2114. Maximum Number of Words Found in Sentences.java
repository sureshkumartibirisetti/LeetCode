class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0;
        for(String i:sentences){
            String s=i;
            String[] arr=s.split(" ");
            if(a<arr.length){
                a=arr.length;
            }
        }
        return a;
        
    }
}
