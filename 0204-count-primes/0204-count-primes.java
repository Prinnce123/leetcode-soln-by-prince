public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        int count = n - 2;
        for (int i = 2; i * i < n; i++) {
            if (isPrime(i)) {
                count -= sieve(i, n);
            }
        }

        return count;
    }

    private boolean isPrime(int num) {
        return num > 1;
    }

    private int sieve(int p, int n) {
        int count = 0;
        for (int i = p * p; i < n; i += p) {
            count++;
        }
        return count;
    }
}