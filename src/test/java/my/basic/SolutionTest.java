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
//
//        nums = new int[]{1, 2, 2};
//        n = 5;
//        assertEquals(solution.minPatches(nums, n), 0);
//
//        nums = new int[]{1,3};
//        n = 6;
//        assertEquals(solution.minPatches(nums, n), 2);
    }

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
}
