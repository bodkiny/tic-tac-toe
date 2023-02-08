package root_package.logic;

import root_package.model.GameTable;

import java.util.Random;

public class Game {

    public final DataDisplayer dataDisplayer;
    public final ComputerMove computerMove;
    public final UserMove userMove;
    public final WinnerVerifier winnerVerifier;
    public final GameTableInspector drawVerifier;

    public Game(DataDisplayer dataDisplayer,
                ComputerMove computerMove,
                UserMove userMove,
                WinnerVerifier winnerVerifier,
                GameTableInspector drawVerifier) {
        this.dataDisplayer = dataDisplayer;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.drawVerifier = drawVerifier;
    }

    public void play() {
        System.out.println("Use the following mapping table to choose the cell for your next move:");
        final GameTable gameTable = new GameTable();
        dataDisplayer.displayMappingTable();

        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataDisplayer.displayTable(gameTable);
        }

        while (true) {
            userMove.make(gameTable);
            dataDisplayer.displayTable(gameTable);

            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN");
                break;
            }
            if (drawVerifier.noCellIsEmpty(gameTable)) {
                System.out.println("DRAW");
                break;
            }

            computerMove.make(gameTable);
            dataDisplayer.displayTable(gameTable);

            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("YOU LOST");
                break;
            }
            if (drawVerifier.noCellIsEmpty(gameTable)) {
                System.out.println("DRAW");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}
