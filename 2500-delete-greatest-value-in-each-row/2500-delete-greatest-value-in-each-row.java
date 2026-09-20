import java.util.*;

class Solution {//2d basic + shorting
    public int deleteGreatestValue(int[][] grid) {

        int max = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            Arrays.sort(grid[i]);

        }
        for (int i = 0; i < col; i++) {
            int sum = 0;

            for (int j = 0; j < row; j++) {
                if (grid[j][i] > sum) {
                    sum = grid[j][i];
                }

            }
            max = max + sum;
        }
        return max;

    }
}