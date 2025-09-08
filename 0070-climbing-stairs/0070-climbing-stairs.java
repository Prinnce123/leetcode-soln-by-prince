class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;  // Base cases

        int first = 1;   // Ways to climb 0 steps (f(0) = 1)
        int second = 1;  // Ways to climb 1 step (f(1) = 1)
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = first + second;  // f(i) = f(i-1) + f(i-2)
            
            // Move the window forward
            first = second;
            second = current;
        }

        return current;
    }
};
