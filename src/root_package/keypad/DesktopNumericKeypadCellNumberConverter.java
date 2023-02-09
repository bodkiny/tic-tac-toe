package root_package.keypad;

import root_package.logic.CellNumberConverter;
import root_package.model.Cell;

public class DesktopNumericKeypadCellNumberConverter implements CellNumberConverter {

    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    @Override
    public Cell toCell(char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mapping[i][j] == number) {
                    return new Cell(i, j);
                }
            }

        }
        return null;
    }

    @Override
    public char toNumber(Cell cell) {
        return mapping[cell.getRow()][cell.getCol()];
    }
}
