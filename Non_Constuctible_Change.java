import java.util.*;

class Program {
    // * Sort the array, then loop through the array and have a sum variable, at any time if the sum+1 > coins[i], return sum+1, 
    //  * Takes O(NlogN) 
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            int nextChange = sum + 1;
            if (coins[i] > nextChange) {
                return nextChange;
            }
            sum += coins[i];
        }
        return sum + 1;
    }
}
