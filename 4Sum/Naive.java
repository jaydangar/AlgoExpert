import java.util.*;

class Program {
    // * O(N^4) = four innter loops
    public static List<Integer[]> fourNumberSum(int[] array, int target) {
        List<Integer[]> _returnList = new ArrayList<Integer[]>();
        int size = array.length;
        for (int i = 0; i < size - 3; i++) {
            // ! Careful here....
            int sum = 0;
            sum += array[i];
            for (int j = i + 1; j < size - 2; j++) {
                // ! Careful here....
                int _secondSum = 0;
                _secondSum += (sum + array[j]);
                for (int k = j + 1; k < size - 1; k++) {
                    // ! Careful here....
                    int _thirdSum = 0;
                    _thirdSum += (_secondSum + array[k]);
                    for (int l = k + 1; l < size; l++) {
                        // ! Careful here....
                        int _finalSum = 0;
                        _finalSum += (_thirdSum + array[l]);
                        if (_finalSum == target) {
                            Integer[] _newInt = new Integer[4];
                            _newInt[0] = array[i];
                            _newInt[1] = array[j];
                            _newInt[2] = array[k];
                            _newInt[3] = array[l];
                            _returnList.add(_newInt);
                        }
                    }
                }
            }
        }
        return _returnList;
    }
}
