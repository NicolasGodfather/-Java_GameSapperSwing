package com.sapper.levels;

import com.sapper.interfaces.NumOfField;

/**
 * TODO: Реализация легкого уровня игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class Easy implements NumOfField {

    @Override
    public int sumRow() {
        return 8;
    }

    @Override
    public int sumColumn() {
        return 8;
    }

    @Override
    public int sumBombs() {
        return 10;
    }
}
