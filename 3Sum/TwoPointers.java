import java.util.*;

class Program {
    /*
     * O(N^2) Sort Array and loop through the array, while use two pointers
     * technique in inner array
     */
    public static List<Integer[]> threeNumberSum(int[] array, int target) {
        Arrays.sort(array);
        List<Integer[]> _returnList = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            sum += array[i];
            int startIndex = i + 1, endIndex = array.length - 1;
            while (startIndex < endIndex) {
                int _totalSum = sum + array[startIndex] + array[endIndex];
                if (_totalSum > target) {
                    endIndex--;
                } else if (_totalSum < target) {
                    startIndex++;
                } else {
                    Integer[] _list = new Integer[3];
                    _list[0] = array[i];
                    _list[1] = array[startIndex];
                    _list[2] = array[endIndex];
                    _returnList.add(_list);
                    startIndex++; // important to update the startIndex
                }
            }
        }
        return _returnList;
    }
}
