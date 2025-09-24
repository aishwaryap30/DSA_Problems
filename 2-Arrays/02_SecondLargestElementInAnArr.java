
/**
 * 🔗 Problem: Second Largest Element in an Array
 * ---------------------------------------------
 * 
 *  Intuition:
 * 
 * ✅ Approach 1 (Brute Force)
 * - Sort the array
 * - Return the second last element
 * 
 * TC: O(n log n)
 * SC: O(1)
 *
 * ----------------------------------------------
 *
 * ✅ Approach 2 (Optimal)
 * - Track two variables: max1 (largest), max2 (second largest)
 * 
 * 2 conditions when max2 is found:
 * - if currrent element > max1 update max1, max2
 * - else if current ele > max2 but current ele != max1 
 * 
 * TC: O(n)
 * SC: O(1)
 *
 * -----------------------------------------------
 */

import java.util.Arrays;

class SecondLargestElement {

    /**
     * 🔹 Optimal Approach
     */
    public static int secondLargestOptimal(int[] arr, int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    /**
     * 🔹 Brute Force Approach
     */
    public static int secondLargestBrute(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 2];
    }

}
