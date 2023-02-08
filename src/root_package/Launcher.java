package root_package;

import root_package.logic.*;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game(new DataDisplayer(),
                new ComputerMove(),
                new UserMove(),
                new WinnerVerifier(),
                new GameTableInspector());

        game.play();
    }
}
