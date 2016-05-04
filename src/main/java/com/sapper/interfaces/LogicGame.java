package com.sapper.interfaces;

/**
 * TODO: Реализация логики игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public interface LogicGame {

    /**
     * Загружаем поле игры
     */
    void loadBoardGame(Cell[][] cells);

    /**
     * Размер всего игрового поля
     */
    Cell[][] sizeField();

    /**
     * Проверка: если пользователь выбрал клетку где бомба, то мы взрываемся
     */
        boolean shouldBang(int x, int y);

    /**
     * Если пользователь всё разгадал, то мы выводим поздравление
     */
    boolean finish();

    /**
     * Событие которое приходит от пользователя
     * После мы должны отметить у себя в бизнес-логике это событие
     * @param x координата
     * @param y координата
     * @param bomb есть ли бомба на клетке
     */
    void suggest(int x, int y, boolean bomb);

    /**
     * Проверка первого хода
     * @return Если на поле нет бомб, возвращаем истину
     */
    boolean checkTheFirstMove();

    /**
     * Очистка вокруг ячейки при первом ходе
     */
    void clearAroundCell(int x, int y);

    /**
     * Генерация бомб на поле
     */
    void bombsGeneration();

    /**
     * Возвращаем количество бомб вокруг ячейки
     */
    int checkingAroundCell(int x, int y);

    /**
     * Проверка и открытие пустых ячеек
     */
    void openEmptyCells();
}
