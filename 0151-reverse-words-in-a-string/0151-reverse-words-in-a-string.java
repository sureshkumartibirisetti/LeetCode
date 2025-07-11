class Solution {
    public String reverseWords(String s) {
        String []arr=s.trim().split("\\s+");
        String j="";       
        for(int i=arr.length-1;i>0;i--)
        {
            j+=arr[i]+" ";   
        }
        return j+arr[0];
    }
}