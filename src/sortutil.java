import java.util.Arrays;

public class SortUtil {

    // UC16 - Bubble Sort (already exists)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    // ✅ UC17 - Arrays.sort()
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
    }
}