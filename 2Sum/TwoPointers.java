import java.util.*;

class Program {

    /* 
    *  O(NLogN) as we'll first sort the array and then have two pointers, start and end pointer, 
    */  

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int endIndex = array.length - 1, startIndex = 0;

        while (startIndex <= endIndex) {
            int calculatedSum = array[startIndex] + array[endIndex];
            if (calculatedSum > targetSum)
                endIndex--;
            else if (calculatedSum < targetSum)
                startIndex++;
            else
                return new int[] { array[startIndex], array[endIndex] };
        }

        return new int[0];
    }
}
