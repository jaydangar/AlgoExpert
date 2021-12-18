class NaiveSolution {

    /*
     * O(N^2) as loop through every element and return array where target == sum
     */

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    int[] returnArray = new int[2];
                    returnArray[0] = array[i];
                    returnArray[1] = array[j];
                    return returnArray;
                }
            }
        }
        return new int[0];
    }
}
