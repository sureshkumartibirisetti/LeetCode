class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                arr[i]=(char)(Math.min(arr[i],arr[j]));
                arr[j]=arr[i];
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}