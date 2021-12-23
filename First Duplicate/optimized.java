class Program {
    // since numbers are from 1 to N, rearrange the numbers in n-1 position in
    // array,
    // check for each number the index, if index already contains same number then
    // return that number..
    // O(N), O(1)
    public int firstDuplicateValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (n < 0) {
                n *= -1;
            }
            if (array[n - 1] < 0) {
                if (array[i] < 0) {
                    array[i] *= -1;
                }
                return array[i];
            }
            array[n - 1] *= -1;
        }
        return -1;
    }
}
