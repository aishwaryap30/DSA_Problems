/*
 * Print all divisors of a Number
 * 
 */
class Solution {

    // Approach 1:
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
    Approach 2: optimized
    Check divisors only up to √n; for each divisor i, print both i and n/i (pair of divisors).
     
    public static void Divisors(int n) {

        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                System.out.print(i);

                if (i != n / i) { // skip perfect square
                    System.out.print(n/i);
                }
            }
        }
    }*/
}