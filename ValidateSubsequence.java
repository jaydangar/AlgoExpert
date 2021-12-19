import java.util.List;

class Program {
    /**
     * Define a variable of matched items and increment it on every match,
     * if the variable value and the sequence length matches in the end, then 
     * it's a valid subsequence else not. 
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int matchedSequenceIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == sequence.get(matchedSequenceIndex)) {
                matchedSequenceIndex++;
            }
            if (matchedSequenceIndex == sequence.size()) {
                return true;
            }
        }
        return false;
    }
}
