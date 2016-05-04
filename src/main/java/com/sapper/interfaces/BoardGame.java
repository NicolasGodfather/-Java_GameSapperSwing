package com.sapper.interfaces;

/**
 * TODO: реализация поведения игровой поля.
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public interface BoardGame {

    /**
     * @return количество бомб
     */
    int returnSumBomb();

    /**
     * метод отменяет предположение на наличие бомбы
     * @param x позиция по горизонтали.
     * @param y позиция по вертикали.
     */
    void cancelSuggestBomb(int x, int y);

    /**
     * метод проверяет предположение на наличие бомбы
     * @param x позиция по горизонтали.
     * @param y позиция по вертикали.
     * @return
     */
    boolean returnSuggestBomb(int x, int y);

    /**
     * Рисует доску исходя из входящего массива ячеек.
     * @param cells Массив ячеек.
     */
    void drawBoard(Cell[][] cells);

    /**
     * Рисует ячейку.
     * @param x позиция по горизонтали.
     * @param y позиция по вертикали.
     */
    void drawCell(int x, int y);

    /**
     * Рисует взрыв всех бомб.
     */
    void drawBang();

    /**
     * Рисует поздравление когда игра выиграна.
     */
    void drawCongratulate();

    /**
     * Рисует проигрыш.
     */
    void drawLosing();
}
