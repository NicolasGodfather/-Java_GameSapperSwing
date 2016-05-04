package com.sapper.gui;

import com.sapper.MainStart;
import com.sapper.interfaces.BoardGame;
import com.sapper.interfaces.Cell;

import javax.swing.*;
import java.awt.*;

/**
 * TODO: Реализация игрового поля
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class GuiBoard extends JPanel implements BoardGame{

    public static final int PADDING = 40;

    public boolean real = false;

    public Cell<Graphics>[][] cells;

    public static int getPADDING() {
        return PADDING;
    }

    @Override
    public int returnSumBomb() {
        int sumBomb = 0;
        for (int x = 0; x != cells.length; x++) {
            for (int y = 0; y != cells[0].length; y++) {
                if (cells[x][y].isSuggestBomb()) sumBomb++;
            }
        }
        return sumBomb;
    }

    @Override
    public void cancelSuggestBomb(int x, int y) {
        this.cells[x][y].cancelSuggestBomb();
    }

    // Если ячейка какую выбрал пользователь уже помечена как бомба, то возвращаем true
    @Override
    public boolean returnSuggestBomb(int x, int y) {
        return this.cells[x][y].isSuggestBomb();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (this.cells != null) {
            for (int x = 0; x != cells.length; x++) {
                for (int y = 0; y != cells[0].length; y++) {
                    cells[x][y].draw(graphics, x, y, real);
                }
            }
        }
    }

    @Override
    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        real = false;
        this.repaint();
    }

    @Override
    public void drawCell(int x, int y) {
        this.repaint();
    }

    @Override
    public void drawBang() {
        real = true;
        this.repaint();
    }

    @Override
    public void drawCongratulate() {
        this.repaint();
        MainStart.setLosing("Нажмите 'OK', чтобы закрыть окно.", " Поздравляем! Вы выиграли!");
    }

    public void drawLosing() {
        this.repaint();
        MainStart.setLosing("Нажмите 'OK', чтобы закрыть окно.", " К сожалению Вы проиграли");
    }
}
