import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        int sum=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                 if (map.containsKey(grid[i][j])) {

                    map.put(grid[i][j], 2);
                    ans[0]=grid[i][j];
                    continue;
                } else {
                    map.put(grid[i][j], 1);
                }
                sum+=grid[i][j];
            }
        }
        int k=grid.length*grid.length;
        ans[1]=((k*(k+1))/2)-sum;
        
        return ans;
    }
}