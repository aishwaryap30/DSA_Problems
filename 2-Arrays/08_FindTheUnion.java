
/**
 * 🔗 Problem: Union of Two Sorted Arrays
 * 
 *  Intuition
 
 * ✅ Approach 1 (Brute Force - Using HashSet)
 * - Add all elements from both arrays to a HashSet
 * - Convert set to array/list
 * 
 * TC: O(n + m)
 * SC: O(n + m)
 *
 * ---------------------------------------------
 * 
 * ✅ Approach 2 (Optimal - Two Pointers)
 * - use 2 pointers i(for arr1) and j(for arr2)
 * - compare element, and add smaller ele and move pointer
 * - add remaining elements if left.
 * 
 * TC: O(n + m)
 * SC: O(n + m) for output array
 *
 * ---------------------------------------------
 */

import java.util.*;

class UnionSortedArrays {

    /**
     * 🔹 Brute Force Approach using HashSet
     */
    public static int[] unionBrute(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int num : arr1)
            set.add(num);
        for (int num : arr2)
            set.add(num);

        // Convert set to array
        for (int x : set) {
            union.add(x);
        }
        Collections.sort(union);

        // copy ele back to array
        int[] unionarr = new int[union.size()];
        for (int i = 0; i < union.size(); i++) {
            unionarr[i] = union.get(i);
        }

        return unionarr;

    }

    /**
     * 🔹 Optimal Approach - Two Pointers
     */
    public static int[] unionOptimal(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                    result.add(arr2[j]);
                j++;
            } else { // equal elements
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }

        // Convert list to array
        int[] union = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            union[k] = result.get(k);
        }
        return union;
    }
}
