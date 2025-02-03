class Solution {
    public int minOperations(int[] arr) {
        return fun(arr, 1, count);
    }

    static int count = 0;

    public static int fun(int[] arr, int index, int count) {
        if (arr.length <= 1) {
            return 0;
        }

        if (index >= arr.length) {
            return count;
        }

        if (arr[index] <= arr[index - 1]) {
            count += arr[index - 1] + 1 - (arr[index]);
            arr[index] = arr[index - 1] + 1;
        }
        return fun(arr, index + 1, count);
    }
}
