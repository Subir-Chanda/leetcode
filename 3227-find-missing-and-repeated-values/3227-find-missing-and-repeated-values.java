import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                 if (map.containsKey(grid[i][j])) {

                    map.put(grid[i][j], 2);
                } else {
                    map.put(grid[i][j], 1);
                }
            }
        }
        for (int i = 1; i <= grid.length * grid[0].length; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i;
                continue;
            }
            if (map.get(i) > 1) {
                ans[0] = i;
            }

        }
        return ans;
    }
}