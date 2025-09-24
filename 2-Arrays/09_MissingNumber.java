
/**
 * 🔗 Problem: Find the Missing Number in Array
 *
 * Intuition:
 * - We are given an array of size n containing numbers from 0 to n with one missing.
 
 *
 * ✅ Approach 1 (Brute Force)
 *   - For every number from 0 to n, check if it exists in the array.
 *   - Missing one will not be found.
 * 
 *   TC: O(n^2), SC: O(1)
 *
 * ------------------------------------------------------------
 * 
 * ✅ Approach 2 (Hashing / Extra Space)
 *   - Insert all numbers into a HashSet.
 *   - Loop from 0 to n and check which number is not in the set.
 * 
 *   TC: O(n), SC: O(n)
 *
 * ---------------------------------------------------------------
 * ✅ Approach 3 (Sum Formula)
 *   - Sum of first n natural numbers = n * (n + 1) / 2
 *   - Missing number =Sum of n natural no – sum of elements present
 * 
 *   TC: O(n), SC: O(1)
 *
 -------------------------------------------------------------------
 */

import java.util.*;

class MissingNumber {

    // 🔹 Approach 1: Brute Force
    public static int missingNumberBrute(int[] arr, int n) {
        for (int num = 0; num <= n; num++) {
            boolean found = false;
            for (int x : arr) {
                if (x == num) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return num;
        }
        return -1;
    }

    // 🔹 Approach 2: Hashing
    public static int missingNumberHash(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }

    // 🔹 Approach 3: Sum Formula
    public static int missingNumberSum(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int x : arr)
            arrSum += x;
        return totalSum - arrSum;
    }

}
