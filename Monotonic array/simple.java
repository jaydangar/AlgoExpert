class Program {
    public static boolean isMonotonic(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        // Decider 0 means equal, 1 means incrementing, 2 means decrementing
        int val = 0;

        while (startIndex < endIndex) {

            int nextIndex = startIndex + 1;
            if (array[startIndex] > array[nextIndex]) {
                if (val == 1) {
                    return false;
                }
                val = 2;
            } else if (array[startIndex] < array[nextIndex]) {
                if (val == 2) {
                    return false;
                }
                val = 1;
            }
            startIndex++;
        }
        return true;
    }
}
