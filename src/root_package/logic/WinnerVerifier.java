package root_package.logic;

import root_package.model.Cell;
import root_package.model.GameTable;

public class WinnerVerifier {
    public boolean isUserWin(GameTable gameTable) {
        return isWinConditionReached(gameTable, 'X');
    }

    public boolean isComputerWin(GameTable gameTable) {
        return isWinConditionReached(gameTable, 'O');
    }

    private boolean isWinConditionReached(GameTable gameTable, char sigh) {
        return isWinnerByRow(gameTable, sigh) ||
                isWinnerByColumn(gameTable, sigh) ||
                isWinnerByMainDiagonal(gameTable, sigh) ||
                isWinnerByAdditionalDiagonal(gameTable, sigh);
    }

    private boolean isWinnerByAdditionalDiagonal(GameTable gameTable, char sigh) {
        return gameTable.getSigh(new Cell(0, 2)) == gameTable.getSigh(new Cell(1, 1)) &&
                gameTable.getSigh(new Cell(1, 1)) == gameTable.getSigh(new Cell(2, 0)) &&
                gameTable.getSigh(new Cell(2, 0)) == sigh;
    }

    private boolean isWinnerByMainDiagonal(GameTable gameTable, char sigh) {
        return gameTable.getSigh(new Cell(0, 0)) == gameTable.getSigh(new Cell(1, 1)) &&
                gameTable.getSigh(new Cell(1, 1)) == gameTable.getSigh(new Cell(2, 2)) &&
                gameTable.getSigh(new Cell(2, 2)) == sigh;
    }

    private boolean isWinnerByColumn(GameTable gameTable, char sigh) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSigh(new Cell(0, i)) == gameTable.getSigh(new Cell(1, i)) &&
                    gameTable.getSigh(new Cell(1, i)) == gameTable.getSigh(new Cell(2, i)) &&
                    gameTable.getSigh(new Cell(2, i)) == sigh) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByRow(GameTable gameTable, char sigh) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSigh(new Cell(i, 0)) == gameTable.getSigh(new Cell(i, 1)) &&
                    gameTable.getSigh(new Cell(i, 1)) == gameTable.getSigh(new Cell(i, 2)) &&
                    gameTable.getSigh(new Cell(i, 2)) == sigh) {
                return true;
            }
        }
        return false;
    }
}
