package my.basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testGameOfLive() {
        int[][] board = new int[][]{};
        solution.gameOfLife(board);
        assertEquals(board.length, 0);

        board = new int[][]{new int[]{0,0,0}};
        solution.gameOfLife(board);
        assertArrayEquals(board[0], new int[]{0,0,0});

        board = new int[][]{new int[]{1, 1}, new int[]{1, 1}};
        solution.gameOfLife(board);
        assertArrayEquals(board[0], new int[]{1, 1});

        board = new int[][]{new int[]{0, 1}, new int[]{1, 1}};
        solution.gameOfLife(board);
        assertArrayEquals(board[0], new int[]{1, 1});
    }

    @Test
    public void testMinPatches() {
        // TODO
        int[] nums = new int[]{1, 5, 10};
        int n = 20;
        assertEquals(solution.minPatches(nums, n), 2);

        nums = new int[]{1, 2, 2};
        n = 5;
        assertEquals(solution.minPatches(nums, n), 0);
    }

    @Test
    public void testSearchMatrix() {
        int[][] matrix = new int[][]{
            new int[]{ 1, 4, 7,11,15},
            new int[]{ 2, 5, 8,12,19},
            new int[]{ 3, 6, 9,16,22},
            new int[]{10,13,14,17,24},
            new int[]{18,21,23,26,30}
        };
        assertTrue(solution.searchMatrix(matrix, 5));
        assertFalse(solution.searchMatrix(matrix, 20));
    }

    @Test
    public void testMaximumGap() {
        assertEquals(0, solution.maximumGap(new int[]{1,1}));
        assertEquals(1, solution.maximumGap(new int[]{1,2}));
        assertEquals(10, solution.maximumGap(new int[]{1, 10, 5, 20}));
    }

    @Test
    public void testJump2() {
        assertEquals(2, solution.jump2(new int[]{2,3,1,1,4}));
    }

    @Test
    public void testCoinChange(){
        assertEquals(-1, solution.coinChange(null, 10));
        assertEquals(0, solution.coinChange(new int[0], 0));
        assertEquals(1, solution.coinChange(new int[]{1}, 1));
        assertEquals(1, solution.coinChange(new int[]{1,2}, 1));
        assertEquals(1, solution.coinChange(new int[]{1,2}, 2));
        assertEquals(-1, solution.coinChange(new int[]{2,3}, 1));
        assertEquals("[2,3] to 5 is 2", 2, solution.coinChange(new int[]{2,3}, 5));
        assertEquals(2, solution.coinChange(new int[]{2,3}, 4));
        assertEquals(1, solution.coinChange(new int[]{2,3}, 3));
    }
}
