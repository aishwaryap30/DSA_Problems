
/**
 * 🔗 Problem: Remove Duplicates from a Sorted Array
 * 
 * ---------------------------------------------
 *  Intuition:

 * ✅ Approach 1 (Brute Force - Using HashSet)
 * - Insert all elements into a HashSet (because hashset only stores unique values).
 * - copy back elements from hashset to original array
 * 
 * TC: O(n) for insertion + O(n) rewrite ≈ O(2n)
 * SC: O(n) (for HashSet)
 *
 * ----------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Two Pointers)
 * - for this array must be sorted so duplicates will be adjacent.
 * - Traverse the array once
 * - Maintain two pointers (i = last unique index, j = iterator).
 * - Whenever a new unique element is found, move i forward and replace arr[i]
 * 
 * TC: O(n)
 * SC: O(1)
 *
 * ---------------------------------------------
 */

import java.util.HashSet;

class RemoveDuplicates {

    /**
     * 🔹 Brute Force Approach: Using HashSet
     */
    public static int removeDuplicatesBrute(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }

        return set.size(); // return new length
    }

    /**
     * 🔹 Optimal Approach: Two Pointers
     */
    public static int removeDuplicatesOptimal(int[] arr) {
        if (arr.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

}
