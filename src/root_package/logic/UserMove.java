package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

import java.util.Scanner;

public class UserMove {

    CellNumberConverter cellNumberConverter;

    public UserMove(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void make(GameTable gameTable) {
        while (true) {
            final Cell cell = getUserInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not empty! Try again!");
            }
        }
    }

    private Cell getUserInput() {
        while (true) {
            System.out.print("Choose the empty cell for your move (enter a number between 1 & 9): ");
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                final char ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    return cellNumberConverter.toCell(ch);
                }
            }
        }
    }
}
