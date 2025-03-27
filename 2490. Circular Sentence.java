class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.split(" ");
        if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr[arr.length-1].length()-1)){
            return false;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i].charAt(0)!=arr[i-1].charAt(arr[i-1].length()-1)){
                return false;
            }
        }
        return true;
    }
}
