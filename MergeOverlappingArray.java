import java.util.*;

class Program {

    // 1. sort array
    // 2. create an empty list which will get updated on every iteration,
    // 3. add first element into the
    public int[][] mergeOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> _returnList = new ArrayList<int[]>();
        _returnList.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int _latestListIndex = _returnList.size() - 1;
            int[] _latestAddedInterval = _returnList.get(_latestListIndex);
            int[] _currentInterval = intervals[i];

            if (_latestAddedInterval[1] >= _currentInterval[0]) {
                _latestAddedInterval[1] = Math.max(_latestAddedInterval[1], _currentInterval[1]);
                _returnList.set(_latestListIndex, _latestAddedInterval);
            } else {
                _returnList.add(_currentInterval);
            }
        }

        return _returnList.toArray(new int[_returnList.size()][2]);
    }
}
