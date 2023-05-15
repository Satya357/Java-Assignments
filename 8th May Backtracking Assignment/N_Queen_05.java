public class N_Queen_05 {
    public static void printQueenSolution(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int column, int n) {
        for (int i = 0; i < column; i++){
            if (board[row][i] == 1)
                return false;
        }

        for (int i = row , j=column; i >= 0 && j>=0; i-- , j--) {
                if (board[i][j] == 1)
                    return false;
        }

        for (int i = row , j=column; i < n && j>=0; i++, j--) {
                if (board[i][j] == 1)
                    return false;
        }

        return true;

    }

    

    public static int solveQueen(int[][] board, int column, int n, int count) {
        if (column >= n) {
            count++;
            return count;
        }
    
        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, column, n)) {
                board[row][column] = 1;
    
                count = solveQueen(board, column + 1, n, count);
    
                board[row][column] = 0;
            }
        };
    
        return count;
    }
    
    public static void main(String[] args) {
        int board[][] = {
                { 0, 0, 0 ,0},
                { 0, 0, 0 ,0},
                { 0, 0, 0 ,0},
                { 0, 0, 0 ,0}
        };
    
        int count = solveQueen(board, 0, board.length, 0);
        System.out.println("Number of solutions: " + count);
    }
    
}
