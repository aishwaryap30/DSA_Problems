/*
 *  Check Given number is prime Number
 * 
 *  Prime Number is a number that has only 2 factors i.e 1 and itself. 
 *  
 *  Approach:
 *  keep the count of factors, if factors are only 2 then it is prime number for sure.
 *  
 */

class Solution {

    // Approach 1:
    static boolean primeCheck(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    /* Approach 2: optimized
    
    We stop at √n because if a number had a divisor bigger than √n, 
    the matching smaller divisor would have already been found earlier.

    static boolean primeCheck(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    */
}
