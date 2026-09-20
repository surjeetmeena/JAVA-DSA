class Solution {//2d better solution 0(n*m)
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i]==1||col[j]==1 ) {//col or row ki value change nahi ho rahi matrix[i][j]=0; se 
                    matrix[i][j] = 0;
                }
            }
        }

    }
}