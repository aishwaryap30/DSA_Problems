
/**
 * 🔗 Problem: Intersection of Two Sorted Arrays(common elements between array)
 *
 *  Intuition:
 *
 *  ✅ Approach 1 (Brute Force - Using HashSet)
 * - Store all elements of arr1 in a HashSet
 * - For each element in arr2, if present in set, add to result (avoid duplicates)
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 *
 *  ---------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Two Pointers)
 * - Use two pointers i, j for arr1 and arr2
 * - If arr1[i] < arr2[j], move i
 * - If arr1[i] > arr2[j], move j
 * - If equal, add to result and move both pointers
 * Time Complexity: O(n + m)
 * Space Complexity: O(n) for result array
 * ---------------------------------------------
 */

import java.util.*;

class IntersectionSortedArrays {

    /**
     * 🔹 Brute Force Approach using HashSet
     */
    public static int[] intersectionBrute(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr1)
            set.add(num);

        for (int num : arr2) {
            if (set.contains(num)) {
                if (!resultList.contains(num)) { // avoid duplicates
                    resultList.add(num);
                }
            }
        }

        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            result[i] = resultList.get(i);

        return result;
    }

    /**
     * 🔹 Optimal Approach - Two Pointers
     */
    public static int[] intersectionOptimal(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert list to array
        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++)
            intersection[k] = result.get(k);

        return intersection;
    }

}
