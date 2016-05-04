package com.sapper.interfaces;

import com.sapper.levels.Easy;
import com.sapper.levels.Expert;
import com.sapper.levels.Medium;

/**
 * TODO: Реализация выбора уровня игры
 *
 * @author Asinovich_Nikolay
 * @since 03.05.2016.
 */
public interface SelectLevel {

    Easy easy();
    Medium medium();
    Expert expert();
}
