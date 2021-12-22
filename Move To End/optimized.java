import java.util.List;

class Program {
    // Two pointer -> comparison O(N),
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int startIndex = 0, endIndex = array.size() - 1;
        while (endIndex > startIndex) {
            int startValue = array.get(startIndex);
            int endValue = array.get(endIndex);

            if (startValue == toMove && endValue != toMove) {
                array.set(startIndex, endValue);
                array.set(endIndex, startValue);
                endIndex--;
            } else if (startValue != toMove && endValue != toMove) {
                startIndex++;
            } else {
                endIndex--;
            }
        }
        return array;
    }
}
