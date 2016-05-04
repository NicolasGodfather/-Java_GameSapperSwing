package com.sapper.interfaces;

/**
 * TODO: Генерация самого игрового поля
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public interface GeneratorBoardGame {
    /**
     * Метод генерирует поле: сложный, средний или легкий уровень
     */
    Cell[][] generate();
}
