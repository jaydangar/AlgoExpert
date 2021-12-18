import java.util.HashMap;
import java.util.Map;

class Program {
    /*
     * O(N) Use Hashmap and add difference (target-current_value) as key and current
     * value as value, check for every value in the key and If it’s in the map then
     * return key, value.
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> _map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            int _key = targetSum - array[i];
            if (_map.containsKey(array[i])) {
                return new int[] { array[i], _map.get(array[i]) };
            } else {
                _map.put(_key, array[i]);
            }
        }
        return new int[0];
    }
}
