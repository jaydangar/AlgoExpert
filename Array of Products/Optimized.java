class Program {
    // O(N) time, O(N) space
    // create a returnArray and left,right multiplication values
    public int[] arrayOfProducts(int[] array) {
        int size = array.length;

        int[] _returnArray = new int[size];

        for (int i = 0; i < size; i++) {
            int leftMultiplication = 1, rightMultiplication = 1;

            for (int j = i - 1; j > -1; j--) {
                leftMultiplication *= array[j];
            }

            for (int j = i + 1; j < array.length; j++) {
                rightMultiplication *= array[j];
            }

            _returnArray[i] = leftMultiplication * rightMultiplication;
        }

        return _returnArray;
    }
}
