class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] arr = new int[10];
        for (int d : digits) arr[d]++;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (arr[i] == 0) continue;
            arr[i]--;
            for (int j = 0; j <= 9; j++) {
                if (arr[j] == 0) continue;
                arr[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (arr[k] == 0) continue;
                    res.add(i*100 + j*10 + k);
                }
                arr[j]++;
            }
            arr[i]++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
