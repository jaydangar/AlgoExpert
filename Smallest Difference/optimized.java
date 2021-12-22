import java.util.Arrays;

class Program {
    // Sort the array and compare, iterate through the array and increment the index
    // of array containing smaller element
    // O(NlogN + N)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int size1 = arrayOne.length;
        int size2 = arrayTwo.length;

        int index1 = 0, index2 = 0, minDiff = Integer.MAX_VALUE, minDiff1 = 0, minDiff2 = 0, num1 = 0, num2 = 0;

        while (index1 < size1 && index2 < size2) {
            num1 = arrayOne[index1];
            num2 = arrayTwo[index2];

            int diff = Math.abs(num1 - num2);

            if (diff < minDiff) {
                minDiff = diff;
                minDiff1 = num1;
                minDiff2 = num2;
            }

            if (num1 > num2) {
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                return new int[] { minDiff1, minDiff2 };
            }
        }

        while (index1 < size1) {
            num1 = arrayOne[index1];
            int diff = Math.abs(num1 - num2);

            if (diff < minDiff) {
                minDiff = diff;
                minDiff1 = num1;
                minDiff2 = num2;
            }

            index1++;
        }

        while (index2 < size2) {
            num2 = arrayTwo[index2];
            int diff = Math.abs(num1 - num2);

            if (diff < minDiff) {
                minDiff = diff;
                minDiff1 = num1;
                minDiff2 = num2;
            }

            index2++;
        }

        return new int[] { minDiff1, minDiff2 };
    }

}
