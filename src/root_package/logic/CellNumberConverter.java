package root_package.logic;

import root_package.model.Cell;

public interface CellNumberConverter {

    Cell toCell(final char number);

    char toNumber(Cell cell);
}
