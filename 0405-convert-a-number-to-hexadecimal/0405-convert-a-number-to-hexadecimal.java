class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        String hex_chars = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        int count = 0; 
        while (num != 0 && count < 8) {
            sb.append(hex_chars.charAt(num & 0xf)); 
            num >>>= 4; 
            count++;
        }
        return sb.reverse().toString();
    }
}