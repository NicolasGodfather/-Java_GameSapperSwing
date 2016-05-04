package com.sapper.action;

import com.sapper.MainStart;
import com.sapper.interfaces.*;

/**
 * TODO: Реализация базовых действий пользователя
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class BaseActions implements UserAction{

    private final GeneratorBoardGame generatorBoardGame;
    private final BoardGame boardGame;
    private final LogicGame logicGame;

    public BaseActions(final LogicGame logicGame, final BoardGame boardGame, final GeneratorBoardGame generatorBoardGame) {
        this.generatorBoardGame = generatorBoardGame;
        this.boardGame = boardGame;
        this.logicGame = logicGame;
    }

    @Override
    public void initGame() {
        final Cell[][] cells = generatorBoardGame.generate();
        this.boardGame.drawBoard(cells);
        this.logicGame.loadBoardGame(cells);
    }

    @Override
    public void select(int x, int y, boolean bomb) {
        this.logicGame.suggest(x, y, bomb);
        if (this.logicGame.checkTheFirstMove() && !bomb) {
            this.logicGame.clearAroundCell(x, y);
            this.logicGame.bombsGeneration();
        }
        MainStart.setLabel("Флажки: " + this.boardGame.returnSumBomb() + " ");
        if (!bomb)
            this.logicGame.openEmptyCells();
        if (this.logicGame.shouldBang(x, y)) {
            this.boardGame.drawBang();
            this.boardGame.drawLosing();
        } else
            this.boardGame.drawCell(x, y);
        if (this.logicGame.finish() && !this.logicGame.shouldBang(x, y))
            this.boardGame.drawCongratulate();
    }
}
