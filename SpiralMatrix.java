import java.util.*;

class Program {

    /**
     * We'll loop through left-right, top-bottom, right-left and bottom top
     * pattern continuously
     */

    public static List<Integer> spiralTraverse(int[][] array) {
        int leftIndex = 0;
        int rightIndex = array[0].length - 1;
        int topIndex = 0;
        int bottomIndex = array.length - 1;

        int counter = 0, totalCounter = array.length * array[0].length;

        List<Integer> _returnList = new ArrayList<Integer>();

        while (counter < totalCounter) {
            
            //  ! be causious as we need to terminate the loop on counter < totalCounter on every loops  
            for (int i = leftIndex; i <= rightIndex && counter < totalCounter; i++) {
                _returnList.add(array[topIndex][i]);
                counter++;
            }

            topIndex++;

            for (int i = topIndex; i <= bottomIndex && counter < totalCounter; i++) {
                _returnList.add(array[i][rightIndex]);
                counter++;
            }

            rightIndex--;

            for (int i = rightIndex; i >= leftIndex && counter < totalCounter; i--) {
                _returnList.add(array[bottomIndex][i]);
                counter++;
            }

            bottomIndex--;

            for (int i = bottomIndex; i >= topIndex && counter < totalCounter; i--) {
                _returnList.add(array[i][leftIndex]);
                counter++;
            }

            leftIndex++;

        }

        return _returnList;
    }
}
