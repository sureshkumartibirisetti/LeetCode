class Solution {
    public boolean checkString(String s) {
        int j = s.length() - 1;
        boolean flag = false;
        for (int i = 0; i <= j; i++) {
            if (s.charAt(i) == 'b') {
                flag = true;
            }
            if (flag == true && s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;
    }
}
