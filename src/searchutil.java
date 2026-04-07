package com.train.consist.util;

import java.util.Arrays;

public class SearchUtil {

    // UC18 - Linear Search
    public static boolean linearSearch(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // ✅ UC19 - Binary Search (Requires sorted array)
    public static boolean binarySearch(String[] bogieIds, String key) {

        // Step 1: Sort array before binary search
        Arrays.sort(bogieIds);

        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            }
            else if (comparison < 0) {
                left = mid + 1; // Search right half
            }
            else {
                right = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }
}