package root_package;

public class Launcher {
    public static void main(String[] args) {
        Game game = new Game(new DataDisplayer(),
                new ComputerMove(),
                new UserMove(),
                new WinnerVerifier(),
                new DrawVerifier());

        game.play();
    }
}
