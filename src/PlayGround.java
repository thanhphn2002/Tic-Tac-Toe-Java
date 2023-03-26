public class PlayGround {
    private int row = 3;
    private int column = 7;

    public void generateTable() {
        System.out.println("Player 1 (X) | Player 2 (O)");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j % 2 == 0)
                    System.out.print('|');
                else
                    System.out.print('-');
            }
            System.out.println();
        }
    }

    public void updateTable(int[][] table, int turn) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j % 2 == 0)
                    System.out.print('|');
                else {
                    switch (table[i][j / 2]) {
                        case 1:
                            System.out.print('X');
                            break;
                        case 2:
                            System.out.print('O');
                            break;
                        default:
                            System.out.print('-');
                    }
                }
            }
            System.out.println();
        }
    }
}
