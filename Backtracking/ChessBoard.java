package Backtracking;

public class ChessBoard {

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call
                board[row][j] = 'X'; // backtracking step
            }
        }
    }

    // Check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Print the board
    public static void printBoard(char board[][]) {
        System.out.println("---------CHESS BOARD---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); // separate different solutions
    }

    public static void main(String[] args) {
        int n = 4; // You can change this to test with different board sizes
        char board[][] = new char[n][n];

        // initialize board with 'X'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0); // Start solving from row 0
    }
}
