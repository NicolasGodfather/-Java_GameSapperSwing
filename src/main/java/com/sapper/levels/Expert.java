package com.sapper.levels;

import com.sapper.interfaces.NumOfField;

/**
 * TODO: Реализация сложного уровня игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public class Expert implements NumOfField {

    @Override
    public int sumRow() {
        return 30;
    }

    @Override
    public int sumColumn() {
        return 16;
    }

    @Override
    public int sumBombs() {
        return 90;
    }
}
