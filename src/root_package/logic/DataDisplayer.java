package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

public class DataDisplayer {
    public void displayMappingTable() {
        System.out.println("-------------\n" +
                "| 7 | 8 | 9 |\n" +
                "-------------\n" +
                "| 4 | 5 | 6 |\n" +
                "-------------\n" +
                "| 1 | 2 | 3 |\n" +
                "-------------");
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
