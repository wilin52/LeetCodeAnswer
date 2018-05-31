/**
 * Created by wilin on 2018/6/1.
 */
public class _840_MagicSquaresInside {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                if (grid[i][j] < 0 || grid[i][j] > 9 || grid[i][j + 1] < 0 || grid[i][j + 1] > 9 ||
                        grid[i][j + 2] < 0 || grid[i][j + 2] > 9 || grid[i + 1][j] < 0 || grid[i + 1][j] > 9 ||
                        grid[i + 1][j + 1] < 0 || grid[i + 1][j + 1] > 9 || grid[i + 1][j + 2] < 0 || grid[i + 1][j + 2] > 9 ||
                        grid[i + 2][j] < 0 || grid[i + 2][j] > 9 || grid[i + 2][j + 1] < 0 || grid[i + 2][j + 1] > 9 ||
                        grid[i + 2][j + 2] < 0 || grid[i + 2][j + 2] > 9) {
                    continue;
                }


                if (grid[i + 1][j + 1] != 5 || grid[i][j] + grid[i][j + 1] + grid[i][j + 2] != 15 ||
                        grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] != 15 ||
                        grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2] != 15 ||
                        grid[i][j] + grid[i + 1][j] + grid[i + 2][j] != 15 ||
                        grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] != 15 ||
                        grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2] != 15 ||
                        grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] != 15 ||
                        grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] != 15) {
                    continue;
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}
