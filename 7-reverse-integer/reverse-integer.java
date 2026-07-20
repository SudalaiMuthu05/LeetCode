class Solution {
    public int reverse(int x) {
        int num = x;
        long sum = 0;
        int rem = 1;
        while (num != 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) sum;
    }
}