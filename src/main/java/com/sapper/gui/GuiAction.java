package com.sapper.gui;

import com.sapper.action.BaseActions;
import com.sapper.interfaces.GeneratorBoardGame;
import com.sapper.interfaces.LogicGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * TODO: Реализация действий в ходе игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class GuiAction extends BaseActions implements ActionListener, MouseListener {

    private GuiBoard guiBoard;

    public GuiAction(LogicGame logicGame, GuiBoard guiBoard, GeneratorBoardGame generatorBoardGame) {
        super(logicGame, guiBoard, generatorBoardGame);
        this.guiBoard = guiBoard;
        this.guiBoard.addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        this.initGame();
    }

    public int returnX(MouseEvent e) {
        return e.getX() / GuiBoard.getPADDING();
    }

    public int returnY(MouseEvent e) {
        return e.getY() / GuiBoard.getPADDING();
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("X: " + returnX(e) + " Y: " + returnY(e));
        System.out.println();

        // Если ячейка уже помечена как бомба и пользователь говорит что в ячейке нет бомбы
        if (guiBoard.returnSuggestBomb(returnX(e), returnY(e)) && e.getButton() != 1)  {
            guiBoard.cancelSuggestBomb(returnX(e), returnY(e));
        } else if (guiBoard.returnSuggestBomb(returnX(e), returnY(e)))
            select(returnX(e), returnY(e), true);
        else
            select(returnX(e), returnY(e), e.getButton() != 1);
        guiBoard.repaint();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
