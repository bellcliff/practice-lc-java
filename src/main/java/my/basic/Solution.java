package my.basic;

public class Solution {

    public void gameOfLife(int[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return;
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = getLiveNeighbors(board, i, j);
                if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3;  // 01 -> 11
                }
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;  // 00 -> 01
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    int getLiveNeighbors(int[][] board, int i, int j) {
        int m = board.length, n = board[0].length, lives = 0;
        int x0 = Math.max(i - 1, 0),
            x1 = Math.min(i + 1, m - 1),
            y0 = Math.max(j - 1, 0),
            y1 = Math.min(j + 1, n - 1);
        for (int x = x0; x <= x1; x++) {
            for (int y = y0; y <= y1; y++) {
                lives += board[x][y] & 1;
            }
        } 
        // remove himself
        lives -= board[i][j] & 1;
        return lives;
    }
    
    /**
     * Given a sorted positive integer array nums and an integer n, add/patch elements to the array such that any number in range [1, n] inclusive can be formed by the sum of some elements in the array. Return the minimum number of patches required.
     *
     * Example 1:
     * nums = [1, 3], n = 6
     * Return 1.
     *
     * Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
     * Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
     * Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
     * So we only need 1 patch.
     *
     * Example 2:
     * nums = [1, 5, 10], n = 20
     * Return 2.
     * The two patches can be [2, 4].
     *
     * Example 3:
     * nums = [1, 2, 2], n = 5
     * Return 0.
     */
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int i = 0, added = 0;
        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i++];
            } else {
                miss <<= 1;
                added++;
            }
        }
        return added;
    }

    /**
     * matrix is ordered in row and column
     * start search from top right corner
     * large then row ++
     * else colomn --
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null 
                || matrix.length == 0 
                || matrix[0].length == 0
                ) return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while (col >= 0 && row <= matrix.length - 1) {
            if ( target < matrix[row][col] ) col--;
            else if (target > matrix[row][col]) row++;
            else return true;
        }

        return false;
    }
}