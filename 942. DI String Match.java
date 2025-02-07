class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int a=0;
        int b=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=a;
                a++;
            }else{
                arr[i]=b;
                b--;
            }
        }
        arr[s.length()]=a;
        return arr;
    }
}
