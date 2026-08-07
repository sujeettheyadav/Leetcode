class Solution {
    public boolean isHappy(int n) {

        while (n != 1 && n != 4) {

            int sum = 0;

            while (n != 0) {
                int digit = n % 10;
                int sq = digit * digit;
                sum += sq;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}