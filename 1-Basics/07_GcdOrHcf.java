/*
 * Find GCD/HCF
 * The GCD of two numbers is the largest number that divides both of them.
 * 
 */

class Solution {

    // Approach 1 - Time Complexity: O(min(a, b))

    static int gcd(int a, int b) {
        int result = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

}