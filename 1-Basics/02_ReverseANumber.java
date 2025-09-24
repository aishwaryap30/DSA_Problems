/*
 * Reverse the given number
 */

class Solution {

    // Time Complexity = O(logn), Space Complexity = O(1)
    static int reverseNum(int num) {

        int rev = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }
        return rev;
    }

}
