class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                break;
            }
        }
        if(i == arr.length){
            return word;
        }
        for(int j = 0; j <= i/2; j++){
            char temp = arr[j];
            arr[j] = arr[i - j];
            arr[i - j] = temp;
        }
        return new String(arr);
    }
}