package my.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void testResolve(){
        int[][] board = new int[][]{};
        GameOfLife gol = new GameOfLife();
        gol.resolve(board);
        assertEquals(board.length, 0);

        board = new int[][]{new int[]{0,0,0}};
        gol.resolve(board);
        assertArrayEquals(board[0], new int[]{0,0,0});

        board = new int[][]{new int[]{1, 1}, new int[]{1, 1}};
        gol.resolve(board);
        assertArrayEquals(board[0], new int[]{1, 1});

        board = new int[][]{new int[]{0, 1}, new int[]{1, 1}};
        gol.resolve(board);
        assertArrayEquals(board[0], new int[]{1, 1});
    }
}
