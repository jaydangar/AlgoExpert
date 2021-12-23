import java.util.*;

class Program {
    // take start and end Index and a copy of the input array
    // compare sorted array values with the input array, if they are not then return 
    // Time Complexity : O(N)
    public static int[] subarraySort(int[] array) {

        int[] _copyArray = array.clone();
        Arrays.sort(_copyArray);

        int startIndex = 0, endIndex = array.length - 1;

        while (startIndex < endIndex) {

            if (array[startIndex] == _copyArray[startIndex]) {
                startIndex++;
            }

            if (array[endIndex] == _copyArray[endIndex]) {
                endIndex--;
            }

            if (array[startIndex] != _copyArray[startIndex] &&
                    array[endIndex] != _copyArray[endIndex]) {
                return new int[] { startIndex, endIndex };
            }
        }

        return new int[] { -1, -1 };
    }
}
