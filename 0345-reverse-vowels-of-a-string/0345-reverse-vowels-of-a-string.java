class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        char ch;
        boolean[] vowel = new boolean[128];

        for(char c : "aeiouAEIOU".toCharArray()){
            vowel[c] = true;
        }

        while(left < right){
            while(left < right && !(vowel[arr[left]])){
                left++;
            }

            while(left < right && !(vowel[arr[right]])){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}