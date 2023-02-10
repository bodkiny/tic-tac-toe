package root_package;

import root_package.keypad.DesktopNumericKeypadCellNumberConverter;
import root_package.keypad.TerminalNumericKeypadCellNumberConverter;
import root_package.logic.*;

public class Launcher {
    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        Game game = new Game(new DataDisplayer(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new GameTableInspector());

        game.play();
    }
}
