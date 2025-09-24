
/**
 * 🔗 Problem: Largest Element in an Array
 * ---------------------------------------------
 * 
 * Intuition:
 * 
 * ✅ Approach 1 (Brute Force)
 * - Sort the array and Return the last element
 * 
 * TC: O(n log n)
 * SC: O(1)
 * 
 *-----------------------------------------------
 * 
 * ✅ Approach 2 (Optimal)
 * - Initialize largest = arr[0]
 * - Traverse array and update largest whenever arr[i] > largest
 * 
 * TC: O(n)
 * SC: O(1)
 *
 * -----------------------------------------------
 */

import java.util.Arrays;

class LargestElement {

    /**
     * 🔹 Optimal Approach
     */
    public static int largestOptimal(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    /**
     * 🔹 Brute Force Approach
     */
    public static int largestBrute(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }
}
