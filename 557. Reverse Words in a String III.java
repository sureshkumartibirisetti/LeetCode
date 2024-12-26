class Solution {
    public String reverseWords(String s) {
        char arr[]=s.toCharArray();

        int left=0;
        int right =0;

        while(right<arr.length){
            if(arr[right]== ' '){
                reverse(arr , left , right-1);
                left=right+1;
            }
            right++;
        }

        reverse(arr, left , right-1);

        return new String(arr);
    }
    public static void reverse(char arr[], int left , int right){
        while(left<right){
            char temp = arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
    }
}
