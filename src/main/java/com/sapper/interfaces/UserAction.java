package com.sapper.interfaces;

/**
 * TODO: Реализация действий пользователя, считывание данных от пользователя
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public interface UserAction {

    /**
     * Кнопка инициализации игры
     */
    void initGame();

    /**
     * Действие пользователя, где он выберет какую-то ячейку
     * @param x координата
     * @param y координата
     * @param bomb есть ли бомба
     */
    void select(int x, int y, boolean bomb);
}
