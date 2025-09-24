/**
 * 🔗 Problem: Linear Search in an Array
 *
 * ---------------------------------------------
 * Intuition:
 * 
 * ✅ Approach: Linear search
 * Traverse the array one by one.
 * - If any element matches the target, return true.
 * - Otherwise, return false after checking all elements.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * ---------------------------------------------
 */

class LinearSearch {

    /**
     * 🔹 Linear Search Method
     */
    public static boolean search(int[] arr, int target) {
        for (int num : arr) {
            if (num == target)
                return true;
        }
        return false;
    }
}
