package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

import java.util.Random;

public class ComputerMove {
    public void make(GameTable gameTable) {

        while (true) {
            final Random random = new Random();
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);
            Cell randomCell = new Cell(row, col);

            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, 'O');
                return;
            }
        }
    }
}
