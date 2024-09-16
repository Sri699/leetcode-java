class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if (n == 1) {
            return true;
        } else if (n==4) {
            return false;
        } else {
            while (n > 0) {
                sum = sum + (int) Math.pow(n % 10, 2);
                n = n / 10;
            }
            return isHappy(sum);
        }
    }
}
