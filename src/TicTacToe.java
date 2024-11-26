import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static String[][] board = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", "9"}
    };
    private static String currentPlayer = "X";
    private static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            playerMove(scanner);
            if (checkWin()) {
                printBoard();
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a tie!");
                gameOver = true;
            } else {
                switchPlayer();
                computerMove();
                if (checkWin()) {
                    printBoard();
                    System.out.println("Computer wins!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a tie!");
                    gameOver = true;
                } else {
                    switchPlayer();
                }
            }
        }
        scanner.close();
    }

    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
        }
    }

    private static void playerMove(Scanner scanner) {
        int move;
        while (true) {
            System.out.println("Player " + currentPlayer + ", choose a position (1-9): ");
            move = scanner.nextInt();
            if (move >= 1 && move <= 9 && board[(move - 1) / 3][(move - 1) % 3].equals(String.valueOf(move))) {
                board[(move - 1) / 3][(move - 1) % 3] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void computerMove() {
        Random rand = new Random();
        int move;
        while (true) {
            move = rand.nextInt(9) + 1;
            if (board[(move - 1) / 3][(move - 1) % 3].equals(String.valueOf(move))) {
                board[(move - 1) / 3][(move - 1) % 3] = "O";
                System.out.println("Computer plays " + move);
                break;
            }
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
    }

    private static boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(currentPlayer) && board[i][1].equals(currentPlayer) && board[i][2].equals(currentPlayer)) {
                return true;
            }
            if (board[0][i].equals(currentPlayer) && board[1][i].equals(currentPlayer) && board[2][i].equals(currentPlayer)) {
                return true;
            }
        }
        if (board[0][0].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][2].equals(currentPlayer)) {
            return true;
        }
        if (board[0][2].equals(currentPlayer) && board[1][1].equals(currentPlayer) && board[2][0].equals(currentPlayer)) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(String.valueOf(i * 3 + j + 1))) {
                    return false;
                }
            }
        }
        return true;
    }
}
