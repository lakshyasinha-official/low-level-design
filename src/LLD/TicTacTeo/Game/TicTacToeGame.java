package LLD.TicTacTeo.Game;

import LLD.TicTacTeo.Model.Board;
import LLD.TicTacTeo.Model.PeiceType;
import LLD.TicTacTeo.Model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public List<Player> playerList;
    public Board board;

    public void initialiseGame() {
        ArrayList<Player> playerArrayList = new ArrayList<>();

        Player player1 = new Player("Lakshya", PeiceType.O, 1);
        Player player2 = new Player("Aish", PeiceType.X, 2);
        playerArrayList.add(player1);
        playerArrayList.add(player2);

        this.playerList = playerArrayList;
        board = new Board(3);
    }

    public void startGame() {
        initialiseGame();
        Scanner scanner = new Scanner(System.in);
        PeiceType turn = PeiceType.O; // Lakshya starts (O)

        while (true) {
            printTheBoard();

            // get a valid move
            int row, col;
            while (true) {
                System.out.print( " (" + turn + ") enter row,col (0-2): ");
                String input = scanner.nextLine();
                String[] parts = input.trim().split(",");
                if (parts.length != 2) {
                    System.out.println("Invalid format. Use row,col (e.g., 1,2).");
                    continue;
                }
                try {
                    row = Integer.parseInt(parts[0].trim());
                    col = Integer.parseInt(parts[1].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid numbers. Try again.");
                    continue;
                }

                if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                    System.out.println("Out of range. Try 0..2.");
                    continue;
                }
                if (!board.addElement(turn, row, col)) {
                    System.out.println("Cell occupied. Try another.");
                    continue;
                }
                break; // move accepted
            }

            // check for winner
            if (checkForWinner(board.getBoard())) {
                printTheBoard();
                System.out.println("Winner: "  + " (" + turn + ")");
                break;
            }

            // check for draw (no free cells left)
            if (!board.isFreeAvailable()) {
                printTheBoard();
                System.out.println("It's a draw!");
                break;
            }

            // switch turn
            turn = (turn == PeiceType.O) ? PeiceType.X : PeiceType.O;
        }

        //scanner.close(); // optional; avoid closing System.in in some environments
    }



    public boolean checkForWinner(char[][] b) {
        char[] cs = {'X', 'O'};

        for (char c : cs) {
            // rows
            for (int r = 0; r < 3; r++) {
                boolean all = true;
                for (int col = 0; col < 3; col++) {
                    if (b[r][col] != c) { all = false; break; }
                }
                if (all) return true;
            }

            // columns
            for (int col = 0; col < 3; col++) {
                boolean all = true;
                for (int r = 0; r < 3; r++) {
                    if (b[r][col] != c) { all = false; break; }
                }
                if (all) return true;
            }

            // main diagonal
            boolean allDiag = true;
            for (int i = 0; i < 3; i++) {
                if (b[i][i] != c) { allDiag = false; break; }
            }
            if (allDiag) return true;

            // anti-diagonal
            boolean allAnti = true;
            for (int i = 0; i < 3; i++) {
                if (b[i][2 - i] != c) { allAnti = false; break; }
            }
            if (allAnti) return true;
        }
        return false;
    }

    public void printTheBoard() {
        char[][] boardd = this.board.getBoard();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                char ch = (boardd[i][j] == '\0') ? ' ' : boardd[i][j];
                System.out.print(ch);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }
}
