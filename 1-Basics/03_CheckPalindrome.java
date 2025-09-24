/*
 * check given number is palindrome or not 
 * 
 * Approach: 
 * Similar to reverse number, just store the num in some variable for last check.
 */

class Solution {

    static boolean palindrome(int num) {

        int temp = num;

        int rev = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }

        if (num == temp) { // palindrome check
            return true;
        }
        return false;
    }

}
