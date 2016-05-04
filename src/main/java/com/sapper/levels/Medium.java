package com.sapper.levels;

import com.sapper.interfaces.NumOfField;

/**
 * TODO: Реализация среднего уровня игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class Medium implements NumOfField {

    @Override
    public int sumRow() {
        return 15;
    }

    @Override
    public int sumColumn() {
        return 15;
    }

    @Override
    public int sumBombs() {
        return 30;
    }
}
