import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Name: HERA NAEEM
 * Date: 2/11/2022
 * Tutorial: 8
 */

class TicTacToeTest {

    //declaring a 2D integer array
    int[][] _array;

    //declaring and initializing an array for the full function
    int[][] array_Full = new int[5][5];

    //for the pieces
    int X = TicTacToe.X;
    int O = TicTacToe.O;

    @BeforeAll
    public static void setUp() {
    }

    /**
     * tests to find if this function will create a 5x4 array
     */
    @Test
    void createBoard_for_5x4() {
        _array = new int[5][4];

        assertEquals(_array, TicTacToe.createBoard(5, 4));
    }

    /**
     * tests to find if this function will create a 3x2 array
     */
    @Test
    void createBoard_for_3x2() {
        _array = new int[3][2];

        assertEquals(_array, TicTacToe.createBoard(3, 2));
    }

    /**
     * tests to find if this function will create a 4x6 array
     */
    @Test
    void createBoard_for_4x6() {
        _array = new int[4][6];

        assertEquals(_array, TicTacToe.createBoard(4, 6));
    }

    /**
     * tests to find if this function will create a 2x5 array
     */
    @Test
    void createBoard_for_2x5() {
        _array = new int[2][5];

        assertEquals(_array, TicTacToe.createBoard(2, 5));
    }

    /**
     * tests to find if this function will create a 1x3 array
     */
    @Test
    void createBoard_for_1x3() {
        _array = new int[1][3];

        assertEquals(_array, TicTacToe.createBoard(1, 3));
    }

    /**
     * test to find if a 5x4 array will give the count of rows length as 5
     */
    @Test
    void rowsIn_length_is5() {
        _array = new int[5][4];
        int rL = _array.length;

        assertEquals(rL, TicTacToe.rowsIn(_array));
    }

    /**
     * test to find if a 3x2 array will give the count of rows length as 3
     */
    @Test
    void rowsIn_length_is3() {
        _array = new int[3][2];
        int rL = _array.length;

        assertEquals(rL, TicTacToe.rowsIn(_array));
    }

    /**
     * test to find if a 4x6 array will give the count of rows length as 4
     */
    @Test
    void rowsIn_length_is4() {
        _array = new int[4][6];
        int rL = _array.length;

        assertEquals(rL, TicTacToe.rowsIn(_array));
    }

    /**
     * test to find if a 2x5 array will give the count of rows length as 2
     */
    @Test
    void rowsIn_length_is2() {
        _array = new int[2][5];
        int rL = _array.length;

        assertEquals(rL, TicTacToe.rowsIn(_array));
    }

    /**
     * test to find if a 1x3 array will give the count of rows length as 1
     */
    @Test
    void rowsIn_length_is1() {
        _array = new int[1][3];
        int rL = _array.length;

        assertEquals(rL, TicTacToe.rowsIn(_array));
    }

    /**
     * tests to find if a 5x4 array will give the count of columns length as 4
     */
    @Test
    void columnsIn_length_is4() {
        _array = new int[5][4];
        int cL = _array[0].length;

        assertEquals(cL, TicTacToe.columnsIn(_array));
    }

    /**
     * tests to find if a 3x2 array will give the count of columns length as 2
     */
    @Test
    void columnsIn_length_is2() {
        _array = new int[3][2];
        int cL = _array[0].length;

        assertEquals(cL, TicTacToe.columnsIn(_array));
    }

    /**
     * tests to find if a 4x6 array will give the count of columns length as 6
     */
    @Test
    void columnsIn_length_is6() {
        _array = new int[4][6];
        int cL = _array[0].length;

        assertEquals(cL, TicTacToe.columnsIn(_array));
    }

    /**
     * tests to find if a 2x5 array will give the count of columns length as 5
     */
    @Test
    void columnsIn_length_is5() {
        _array = new int[2][5];
        int cL = _array[0].length;

        assertEquals(cL, TicTacToe.columnsIn(_array));
    }

    /**
     * tests to find if a 1x3 array will give the count of columns length as 3
     */
    @Test
    void columnsIn_length_is3() {
        _array = new int[1][3];
        int cL = _array[0].length;

        assertEquals(cL, TicTacToe.columnsIn(_array));
    }

    @Test
    void canPlay() {
    }

    /**
     * test to find an empty space on the board and then assign a piece to it to that specified location
     */
    @Test
    void playTopMiddle() {
        int[][] emptySpace = new int[][]{{X, 0, O,
                O, X, X,
                O, X, O}};

        int[][] played = new int[][]{{X, X, O,
                O, X, X,
                O, X, O}};

        TicTacToe.play(emptySpace, 0, 1, X);
        assertArrayEquals(played, emptySpace);
    }

    /**
     * test to find an empty space on the board and then assign a piece to it to that specified location
     */
    @Test
    void playBottomMiddleFor_X() {
        int[][] emptySpace = new int[][]{{X, X, O,
                O, X, X,
                O, 0, O}};

        int[][] played = new int[][]{{X, X, O,
                O, X, X,
                O, X, O}};

        TicTacToe.play(emptySpace, 2, 1, X);
        assertArrayEquals(played, emptySpace);
    }

    /**
     * test to find an empty space on the board and then assign a piece to that specified location
     */
    @Test
    void playBoardMiddleFor_X() {
        int[][] emptySpace = new int[][]{{X, X, O,
                O, 0, X,
                O, X, O}};

        int[][] played = new int[][]{{X, X, O,
                O, X, X,
                O, X, O}};

        TicTacToe.play(emptySpace, 1, 1, X);
        assertArrayEquals(played, emptySpace);
    }

    /**
     * test to find an empty space on the board and then assign a piece to it to that specified location
     */
    @Test
    void playBoardMiddleFor_O() {
        int[][] emptySpace = new int[][]{{X, X, O,
                O, 0, X,
                O, X, O}};

        int[][] played = new int[][]{{X, X, O,
                O, O, X,
                O, X, O}};

        TicTacToe.play(emptySpace, 1, 1, O);
        assertArrayEquals(played, emptySpace);
    }

    /**
     * test to find an empty space on the board and then assign a piece to it to that specified location
     */
    @Test
    void playBottomMiddleFor_O() {
        int[][] emptySpace = new int[][]{{X, X, O,
                O, X, X,
                O, 0, O}};

        int[][] played = new int[][]{{X, X, O,
                O, X, X,
                O, O, O}};

        TicTacToe.play(emptySpace, 2, 1, O);
        assertArrayEquals(played, emptySpace);
    }

    /**
     * tests to find if the element is empty at specified location
     */
    @Test
    void fullTopRightCorner() {
        if (array_Full[0][4] == TicTacToe.EMPTY) {
            assertFalse(TicTacToe.full(array_Full));
            System.out.println("The board is not full.");
        }
    }

    /**
     * tests to find if the element is not empty at specified location
     */
    @Test
    void fullBottomRightCorner() {
        if (array_Full[4][4] != TicTacToe.EMPTY) {
            assertTrue(TicTacToe.full(array_Full));
            System.out.println("The board is full.");
        }
    }

    /**
     * tests to find if the element is empty at specified location
     */
    @Test
    void fullTopLeftCorner() {
        if (array_Full[0][0] == TicTacToe.EMPTY) {
            assertFalse(TicTacToe.full(array_Full));
            System.out.println("The board is not full.");
        }
    }

    /**
     * tests to find if the element is not empty at specified location
     */
    @Test
    void fullBottomLeftCorner() {
        if (array_Full[4][0] != TicTacToe.EMPTY) {
            assertTrue(TicTacToe.full(array_Full));
            System.out.println("The board is full");
        }
    }

    /**
     * tests to find if the element is empty at specified location
     */
    @Test
    void fullBottomMiddle() {
        if (array_Full[4][2] == TicTacToe.EMPTY) {
            assertFalse(TicTacToe.full(array_Full));
            System.out.println("The board is not full");
        }
    }

    /**
     * tests to find if an array of size 3x3 has 3 consecutive wins of X's in row 2
     */
    @Test
    void winInRow2() {
        int[][] noWin_rows = new int[][]{{X, O, X,
                O, X, O,
                O, X, O}};

        int[][] win_rows = new int[][]{{X, O, X,
                O, X, O,
                X, X, X}};

        TicTacToe.winInRow(noWin_rows, 2, X);
        assertArrayEquals(win_rows, noWin_rows);
    }

    /**
     * tests to find if an array of size 3x3 has 3 consecutive wins of X's in row 0
     */
    @Test
    void winInRow0() {
        int[][] noWin_rows = new int[][]{{X, O, X,
                O, X, O,
                O, X, O}};

        int[][] win_rows = new int[][]{{X, X, X,
                O, X, O,
                X, O, X}};

        TicTacToe.winInRow(noWin_rows, 0, X);
        assertArrayEquals(win_rows, noWin_rows);
    }

    /**
     * tests to find if an array of size 3x3 has 3 consecutive wins of X's in row 1
     */
    @Test
    void winInRow1() {
        int[][] noWin_rows = new int[][]{{X, O, X,
                O, X, O,
                O, X, O}};

        int[][] win_rows = new int[][]{{X, O, X,
                X, X, X,
                O, X, O}};

        TicTacToe.winInRow(noWin_rows, 1, X);
        assertArrayEquals(win_rows, noWin_rows);
    }

    /**
     * tests to find if an array of size 4x3 has 3 consecutive wins of O's in row 3
     */
    @Test
    void winInRow3() {
        int[][] noWin_rows = new int[][]{{X, O, X,
                O, X, O,
                O, X, O,
                X, X, O,}};

        int[][] win_rows = new int[][]{{X, O, X,
                X, X, O,
                O, X, O,
                O, O, O}};

        TicTacToe.winInRow(noWin_rows, 3, X);
        assertArrayEquals(win_rows, noWin_rows);
    }

    /**
     * tests to find if an array of size 5x3 has 3 consecutive wins of O's in row 4
     */
    @Test
    void winInRow4() {
        int[][] noWin_rows = new int[][]{{X, O, X,
                O, X, O,
                O, X, O,
                X, X, O,
                O, X, X}};

        int[][] win_rows = new int[][]{{X, O, X,
                X, O, X,
                O, X, O,
                O, X, O,
                O, O, O}};

        TicTacToe.winInRow(noWin_rows, 4, X);
        assertArrayEquals(win_rows, noWin_rows);
    }

    /**
     * tests to find if an array of size 3x5 has 3 consecutive wins of O's in column 0
     */
    @Test
    void winInColumn0() {
        int[][] noWin_columns = new int[][]{{X, O, X, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        int[][] win_columns = new int[][]{{O, O, X, O, X,
                O, X, O, X, O,
                O, X, O, X, O}};

        TicTacToe.winInColumn(noWin_columns, 0, O);
        assertArrayEquals(win_columns, noWin_columns);
    }

    /**
     * tests to find if an array of size 3x5 has 3 consecutive wins of X's in column 1
     */
    @Test
    void winInColumn1() {
        int[][] noWin_columns = new int[][]{{X, O, X, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        int[][] win_columns = new int[][]{{O, X, X, O, X,
                X, X, O, X, O,
                O, X, O, X, O}};

        TicTacToe.winInColumn(noWin_columns, 1, X);
        assertArrayEquals(win_columns, noWin_columns);
    }

    /**
     * tests to find if an array of size 3x5 has 3 consecutive wins of O's in column 2
     */
    @Test
    void winInColumn2() {
        int[][] noWin_columns = new int[][]{{X, O, X, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        int[][] win_columns = new int[][]{{X, O, O, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        TicTacToe.winInColumn(noWin_columns, 2, O);
        assertArrayEquals(win_columns, noWin_columns);
    }

    /**
     * tests to find if an array of size 3x5 has 3 consecutive wins of O's in column 3
     */
    @Test
    void winInColumn3() {
        int[][] noWin_columns = new int[][]{{X, O, X, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        int[][] win_columns = new int[][]{{O, O, X, O, X,
                X, X, O, O, X,
                O, X, O, O, O}};

        TicTacToe.winInColumn(noWin_columns, 3, O);
        assertArrayEquals(win_columns, noWin_columns);
    }

    /**
     * tests to find if an array of size 3x5 has 3 consecutive wins of X's in column 4
     */
    @Test
    void winInColumn4() {
        int[][] noWin_columns = new int[][]{{X, O, X, O, X,
                O, X, O, X, O,
                X, X, O, X, O}};

        int[][] win_columns = new int[][]{{O, O, X, O, X,
                X, X, O, X, X,
                X, X, O, X, X}};

        TicTacToe.winInColumn(noWin_columns, 4, X);
        assertArrayEquals(win_columns, noWin_columns);
    }

    @Test
    void winInDiagonalBS() {
    }

    @Test
    void main() {
    }

    @Test
    void factorial() {
    }

    @AfterAll
    public static void end() {
        System.out.println("All tests complete!");
    }
}
