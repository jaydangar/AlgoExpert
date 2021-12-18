import java.util.*;

class Program {
    // * Loop thrice and return add to list where sum is equals to target
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int arraySize = array.length;
        List<Integer[]> returnList = new ArrayList<Integer[]>();
        for (int i = 0; i < arraySize - 2; i++) {
            int sum = array[i];
            for (int j = i + 1; j < arraySize - 1; j++) {
                int tempSum = sum;
                tempSum += array[j];
                for (int k = j + 1; k < arraySize; k++) {
                    int tempSum2 = tempSum;
                    tempSum2 += array[k];
                    if (targetSum == tempSum2) {
                        Integer[] sumList = new Integer[3];
                        sumList[0] = array[i];
                        sumList[1] = array[j];
                        sumList[2] = array[k];
                        returnList.add(sumList);
                    }
                }
            }
        }
        return returnList;
    }
}
