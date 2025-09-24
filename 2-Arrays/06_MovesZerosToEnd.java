
/**
 * 🔗 Problem: Move Zeroes to End of Array
 *
 * Intuition:
 *
 * ✅ Approach 1 (Brute Force)
 * - Store all non-zero elements in a temp array/list
 * - Copy them back to original array
 * - Fill remaining positions with zero
 * 
 * TC: O(2n)
 * SC: O(n)
 *
 * ----------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Two Pointers)
 *       i → next position to place a non-zero element
 *       j → iterator through the array
 * - Place non-zero elements at the next available position
 * - Fill remaining positions with zero
 * 
 * 
 * TC: O(n)
 * SC: O(1)
 *
 * ---------------------------------------------
 */

import java.util.ArrayList;

class MoveZeroes {

    /**
     * 🔹 Brute Force Approach
     */
    public static void moveZeroBrute(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        // Store all non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Copy non-zero elements back
        int i = 0;
        for (int num : temp) {
            arr[i++] = num;
        }

        // Fill remaining with zeros
        while (i < n) {
            arr[i++] = 0;
        }
    }

    /**
     * 🔹 Optimal Approach (Two Pointers)
     */
    public static void moveZeroOptimal(int[] arr) {
        int i = 0; // next position for non-zero element

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i++] = arr[j]; // place non-zero element
            }
        }

        // Fill remaining positions with zeros
        while (i < arr.length) {
            arr[i++] = 0;
        }
    }

}
