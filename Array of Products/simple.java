class Program {
    // Time Complexity - O(N)
    // Count number of zeros, if they are > 1 then put 0, 
    public int[] arrayOfProducts(int[] array) {
        int totalMultiplication = 1;

        int[] _returnArray = new int[array.length];
        int countZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                totalMultiplication *= array[i];
            } else {
                countZeros++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (countZeros > 1) {
                array[i] = 0;
            } else if (countZeros == 1) {
                if (array[i] == 0) {
                    array[i] = totalMultiplication;
                } else {
                    array[i] = 0;
                }
            } else {
                array[i] = totalMultiplication / array[i];
            }
        }

        return _returnArray;
    }
}
