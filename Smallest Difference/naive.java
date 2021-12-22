import java.util.*;

class Program {
    // BruteForce Search - O(N^2)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] _returnValue = new int[2];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int AbsDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (AbsDiff < minDiff) {
                    minDiff = AbsDiff;
                    _returnValue[0] = arrayOne[i];
                    _returnValue[1] = arrayTwo[j];
                }
            }
        }
        return _returnValue;
    }
}
