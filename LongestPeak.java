import java.util.*;

class Program {
    public static int longestPeak(int[] array) {

        int maxLength = 0;

        // Loop from 1 to n-2, check for the peak only if peek is identified...
        for (int i = 1; i < array.length - 1; i++) {
            int previousVal = array[i - 1],
                    currentVal = array[i],
                    nextVal = array[i + 1];

            // check if the current number is the peak or not...
            if (previousVal < currentVal && nextVal < currentVal) {
                int count = 1;

                for (int j = i; j > 0 && array[j] > array[j - 1]; j--) {
                    count++;
                }

                for (int j = i; j < array.length - 1 && array[j] > array[j + 1]; j++) {
                    count++;
                }

                if (count > maxLength) {
                    maxLength = count;
                }
            }
        }

        return maxLength;
    }
}