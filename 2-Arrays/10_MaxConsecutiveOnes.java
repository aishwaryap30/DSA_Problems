/**
 * 🔗 Problem: Maximum Consecutive Ones
 *
 * Intuition:
 * - We need the longest streak of `1`s in a binary array.
 * 
 * - Optimal: Use a single pass with a counter. Reset on `0`. (O(n))
 *
 * ---------------------------------------------
 * ✅ Approach 1 (Brute Force)
 * - For each index, count streak of ones. (O(n^2))
 * - Check consecutive 1s starting at each index
 * - Update max streak
 * 
 * TC: O(n^2), SC: O(1)
 *
 * ---------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Single Pass)
 * - Traverse array once, maintain a running count of 1s
 * - Reset when 0 appears, track max streak
 * 
 * TC: O(n), SC: O(1)
 * ---------------------------------------------
 */

class MaxConsecutiveOnes {

    // 🔹 Brute Force
    public static int findMaxConsecutiveOnesBrute(int[] arr) {
        int n = arr.length;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1)
                    count++;
                else
                    break;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    // 🔹 Optimal Solution
    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0, count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; // reset when zero encountered
            }
        }
        return maxCount;
    }

}
