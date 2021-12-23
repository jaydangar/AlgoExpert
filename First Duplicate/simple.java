import java.util.*;

class Program {
    // O(N), O(N), create list and put visited array element in it,
    // if the number is visited then return it
    public int firstDuplicateValue(int[] array) {
        List<Integer> _list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!_list.contains(array[i])) {
                _list.add(array[i]);
            } else {
                return array[i];
            }
        }
        return -1;
    }
}
