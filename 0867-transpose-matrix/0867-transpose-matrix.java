class Solution {//2d array basic 
    public int[][] transpose(int[][] matrix) {
        int ans[][] = new int[matrix[0].length][matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[j].length; i++) {
                ans[i][j] = matrix[j][i];

            }
        }
        return ans;
    }
}