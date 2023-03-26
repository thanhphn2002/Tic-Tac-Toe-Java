import java.util.Scanner;

public class Main {
    public static PlayGround playGround = new PlayGround();
    public static PlayGame playGame = new PlayGame();

    public static void main (String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        playGround.generateTable();

        int turn = 0;
        boolean isWin = false;

        do {
            int player = turn % 2 + 1;

            System.out.print("Player " + (player) + ": ");
            int s = scanner.nextInt();
            int row = s / 10 - 1;
            int column = s % 10 - 1;

            if (row < 0 || column < 0 || row > 2 || column > 2)
                System.out.println("Out of bound !!!");
            else if (!playGame.checkIndex(row, column))
                System.out.println("This cell is already checked !!!");

            else {
                playGame.getIndex(row, column, player);
                turn++;

                int[][] table = playGame.getTable();
                playGround.updateTable(table, player);

                if (turn > 4) {
                    if (playGame.checkWin(player)) {
                        System.out.println("Player " + player + " Won!");
                        isWin = true;
                        break;
                    }
                }
            }
        } while (turn < 9);

        if (!isWin)
            System.out.println("--- DRAW ---");
    }
}
