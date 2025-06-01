public class KnightTourProblem {
        static int N = 8;

        // Possible moves for a knight
        static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        static boolean isSafe(int x, int y, int[][] board) {
            return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
        }
        static boolean solveKnightsTour() {
            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    board[i][j] = -1;
                }
            }
            board[0][0] = 0;
            if (!knightTour(0, 0, 1, board)) {
               // System.out.println("No solution exists!");
                return false;
            } else {
                printBoard(board);
            }
            return true;
        }
        static boolean knightTour(int x, int y, int moveCount, int[][] board) {
            if (moveCount == N * N) {
                return true;
            }

            for (int i = 0; i < 8; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (isSafe(nextX, nextY, board)) {
                    board[nextX][nextY] = moveCount;
                    if (knightTour(nextX, nextY, moveCount + 1, board)) {
                        return true;
                    }
                    board[nextX][nextY] = -1;
                }
            }
            return false;
        }
        static void printBoard(int[][] board) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            System.out.println(solveKnightsTour());
        }
    }

