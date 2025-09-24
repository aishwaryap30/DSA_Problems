/*
 *  Check Given number is Armstrong Number
 * 
 *  Armstrong Number is a number that is equal to the sum of its own digits, 
 *  each raised to the power of the number of digits in the number. 
 *  
 *
 *  153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 *  1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634.
 */

class Solution {

    static boolean armstrongNum(int num) {

        int temp = num;
        int digits = String.valueOf(num).length(); // count digits easily
        int sum = 0;

        int n = num;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit, digits);
            n /= 10;
        }

        if (sum == temp) {
            return true;
        }
        return false;
    }

}
