public class PlayGame {
    private int[][] table = new int[3][3];

    public int[][] getTable() {
        return table;
    }

    //  Get cell player checked
    public void getIndex(int i, int j, int player) {
        table[i][j] = player;
    }

    // Check if the cell is checked or not
    public boolean checkIndex(int i, int j) {
        return table[i][j] == 0;
    }

    public boolean checkWin(int player) {
        // Check row
        for (int i = 0; i < 3; i++)
            if (table[i][0] == player && table[i][1] == player && table[i][2] == player)
                return true;

        // Check column
        for (int j = 0; j < 3; j++)
            if (table[0][j] == player && table[1][j] == player && table[2][j] == player)
                return true;

        // Check diagonals
        if (table[0][0] == player && table[1][1] == player && table[2][2] == player)
            return true;

        // check anti-diagonals
        if (table[2][0] == player && table[1][1] == player && table[0][2] == player)
            return true;
        return false;
    }
}