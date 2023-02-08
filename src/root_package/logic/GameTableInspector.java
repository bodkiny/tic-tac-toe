package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

public class GameTableInspector {
    public boolean noCellIsEmpty(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Cell(i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
