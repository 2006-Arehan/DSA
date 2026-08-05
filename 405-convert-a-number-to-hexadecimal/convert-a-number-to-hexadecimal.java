class Solution {
    private static final String HEX = "0123456789abcdef";

    public String toHex(int num) {
        if (num == 0) return "0";
        return helper(num & 0xFFFFFFFFL);
    }

    private String helper(long n) {
        if (n == 0) return "";
        return helper(n / 16) + HEX.charAt((int)(n % 16));
    }
}