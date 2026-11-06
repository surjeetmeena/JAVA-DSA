class Solution {
    public int deleteGreatestValue(int[][] grid) {
        
        int sum=0; 
        int max=Integer.MIN_VALUE;
        for(int i=0; i<grid.length; i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0; i<grid[0].length; i++){
            for(int j=0; j<grid.length; j++){
                max=Math.max(max,grid[j][i]);

            }
            sum=sum+max;
            max=0;
        }
        return sum;
    }
}