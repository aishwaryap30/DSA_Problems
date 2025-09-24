
/**
 * 🔗 Problem: Left Rotate an Array by One Place
 *
 * ---------------------------------------------
 * Intuition:
 *
 * ✅ Approach 1 (Brute Force)
 * - Copy all elements except the first to a temporary array.
 * - Place the first element at the last position.
 * 
 * TC: O(n)
 * SC: O(n)
 *
 * ---------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - In-place)
 * - Store the first element in a variable.
 * - Shift all elements one position to the left.
 * - Place the stored first element at the end.
 * 
 * TC: O(n)
 * SC: O(1)
 *
 * ---------------------------------------------
 */

class LeftRotateArray {

    /**
     * 🔹 Brute Force Approach
     */
    public static void rotateBrute(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    /**
     * 🔹 Optimal Approach - In-place
     */
    public static void rotateOptimal(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return;

        int firstEle = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = firstEle;
    }

}
