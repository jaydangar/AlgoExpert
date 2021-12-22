package SortedSquareArray;
class Program {
	// Use Two pointers, start and end pointer and an empty array, loop through the
	// array and fill the empty array starting from the end
	// Time complexity is O(N).
	public int[] sortedSquaredArray(int[] array) {
		int[] _returnArray = new int[array.length];
		int startIndex = 0, endIndex = array.length - 1;
		int _returnArrayInsertIndex = array.length - 1;
		while (_returnArrayInsertIndex > -1) {
			int startAbs = Math.abs(array[startIndex]);
			int endAbs = Math.abs(array[endIndex]);
			if (startAbs >= endAbs) {
				_returnArray[_returnArrayInsertIndex] = array[startIndex] * array[startIndex];
				startIndex++;
			} else {
				_returnArray[_returnArrayInsertIndex] = array[endIndex] * array[endIndex];
				endIndex--;
			}
			_returnArrayInsertIndex--;
		}
		return _returnArray;
	}
}
