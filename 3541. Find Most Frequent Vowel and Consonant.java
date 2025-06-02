class Solution {
    public int maxFreqSum(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            arr[a]++;
        }
        int v=0;
        int c=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                if(v<arr[i]){
                    v=arr[i];
                }
            }else{
                if(c<arr[i]){
                    c=arr[i];
                }
            }
        }
        return (v+c); 
    }
}
