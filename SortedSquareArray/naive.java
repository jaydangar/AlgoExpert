package SortedSquareArray;
import java.util.*;

class Program {
	// * Loop through array and square each element and sort the resultant array,
	// * O(NLogN)
	public int[] sortedSquaredArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= array[i];
		}
		Arrays.sort(array);
		return array;
	}
}
