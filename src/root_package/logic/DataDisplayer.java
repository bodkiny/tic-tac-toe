package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

public class DataDisplayer {

    CellNumberConverter cellNumberConverter;

    public DataDisplayer(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void displayMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + cellNumberConverter.toNumber(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public void displayTable(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSigh(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}
