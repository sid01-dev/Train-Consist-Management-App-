package com.train.consist.util;

public class SearchUtil {

    // UC18 - Linear Search for Bogie ID
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Safe string comparison
            if (bogieIds[i].equals(key)) {
                return true; // Early termination
            }
        }

        return false; // Not found
    }
}