/**
 * 🔗 Problem: Check if Array is Sorted
 * ---------------------------------------------
 * 🧠 Intuition:
 * - An array is sorted if every element is less than or equal to the next one.
 * 
 * 
 * ✅ Approach 1 (Brute Force - Compare all pairs)
 * - For every element, check with all elements after it
 * - If any arr[i] > arr[j], return false
 * 
 * TC: O(n²)
 * SC: O(1)
 *
 * ----------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Single Pass)
 * - Traverse once
 * - If arr[i] < arr[i-1], return false
 * - Otherwise, return true
 * 
 * TC: O(n)
 * SC: O(1)
 * 
 * ----------------------------------------------
 */

class ArraySortedCheck {

    /**
     * 🔹 Brute Force Approach
     */
    public static boolean isSortedBrute(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 🔹 Optimal Approach
     */
    public static boolean isSortedOptimal(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
