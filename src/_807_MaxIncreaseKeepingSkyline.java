/**
 * Created by wilin on 2018/5/31.
 */
public class _807_MaxIncreaseKeepingSkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;
        int[] highCol = new int[grid.length];
        int[] highRow = new int[grid[0].length];
        for(int i = 0;i < highCol.length;i++){
            for(int j = 0;j < grid[i].length; j++){
                highCol[i]  = Math.max(highCol[i],grid[i][j]);
                highRow[j]  = Math.max(highRow[j],grid[i][j]);
            }
        }

        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length; j++){
                count += Math.min(highCol[i],highRow[j]) - grid[i][j];
            }
        }

        return count;
    }
}
