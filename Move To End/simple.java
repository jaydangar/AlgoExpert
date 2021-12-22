import java.util.*;

class Program {
    // Create Two Lists and if the number==target then add it to the end list else
    // add other elements in startList
    // at last append startlist to end list and return startlist -> O(N)
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        List<Integer> _endList = new ArrayList<Integer>();
        List<Integer> _startList = new ArrayList<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int number = array.get(i);
            if (number == toMove) {
                _endList.add(number);
            } else {
                _startList.add(number);
            }
        }
        _startList.addAll(_endList);
        return _startList;
    }
}
