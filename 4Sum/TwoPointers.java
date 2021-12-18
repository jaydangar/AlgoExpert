import java.util.*;

class Program {

    // * O(N^3)+O(NlogN) = Sort the array and use two inner loops and then in the last loop use two pointer technique.
    public static List<Integer[]> fourNumberSum(int[] array, int target) {
        Arrays.sort(array);
        List<Integer[]> _returnList = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 3; i++) {
            int sum = array[i];
            int tempSum1 = sum;
            for (int j = i + 1; j < array.length - 2; j++) {
                int tempSum2 = tempSum1 + array[j];
                int leftIndex = j + 1;
                int rightIndex = array.length - 1;
                while (leftIndex < rightIndex) {
                    int totalSum = tempSum2 + array[leftIndex] + array[rightIndex];
                    if (totalSum < target) {
                        leftIndex++;
                    } else if (totalSum > target) {
                        rightIndex--;
                    } else {
                        Integer[] _intList = new Integer[4];
                        _intList[0] = array[i];
                        _intList[1] = array[j];
                        _intList[2] = array[leftIndex];
                        _intList[3] = array[rightIndex];
                        _returnList.add(_intList);
                        rightIndex--;
                    }
                }
            }
        }
        return _returnList;
    }
}
