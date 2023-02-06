package root_package.model;

public class GameTable {

    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public boolean isEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public char getSigh(final Cell cell) {
        return table[cell.getRow()][cell.getCol()];
    }

    public void setSign(final Cell cell, final char sigh) {
        table[cell.getRow()][cell.getCol()] = sigh;
    }
}
