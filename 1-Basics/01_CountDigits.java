/*
 * Count Digits in Given Number 
 * 
 * Approach :
 * extract of last digit:  num % 10 --- gives remainder (which is the last digit)
 * Removing of last digit: num/10 --- Gives integer value i.e removes last digit
 * 
 */

class solution {

    // Time Complexity = O(logn) or O(no. of digits), Space Complexity = O(1)

    static int countDigits(int Num) {

        int count = 0;
        while (Num > 0) {

            int lastdigit = Num % 10;
            System.out.print(lastdigit + " ");
            Num = Num / 10;
        }
        return count;

    }

}
