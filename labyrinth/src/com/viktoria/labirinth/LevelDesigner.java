package com.viktoria.labirinth;

import com.viktoria.labirinth.Level;

public class LevelDesigner {

    public static final char PRINCESS = '2';

    public static final char PRINCE = '1';

    public static final char COLLUM = 'o';

    public static final char DOT = '.';

    public static Level[] getLevels() {

        char[][] thirdFloorArea = new char[3][3];
        thirdFloorArea[0][0] = '1';
        thirdFloorArea[0][1] = '.';
        thirdFloorArea[0][2] = '.';
        thirdFloorArea[1][0] = 'o';
        thirdFloorArea[1][1] = 'o';
        thirdFloorArea[1][2] = '.';
        thirdFloorArea[2][0] = '.';
        thirdFloorArea[2][1] = '.';
        thirdFloorArea[2][2] = '.';

        char[][] secondFloorArea = new char[3][3];
        secondFloorArea[0][0] = 'o';
        secondFloorArea[0][1] = 'o';
        secondFloorArea[0][2] = 'o';
        secondFloorArea[1][0] = '.';
        secondFloorArea[1][1] = '.';
        secondFloorArea[1][2] = 'o';
        secondFloorArea[2][0] = '.';
        secondFloorArea[2][1] = 'o';
        secondFloorArea[2][2] = 'o';

        char[][] firstFloorArea = new char[3][3];
        firstFloorArea[0][0] = 'o';
        firstFloorArea[0][1] = 'o';
        firstFloorArea[0][2] = 'o';
        firstFloorArea[1][0] = 'o';
        firstFloorArea[1][1] = '.';
        firstFloorArea[1][2] = '.';
        firstFloorArea[2][0] = 'o';
        firstFloorArea[2][1] = '.';
        firstFloorArea[2][2] = '2';

        Level[] allLevels = new Level[3];

        Level thirdLevel = new Level(3, thirdFloorArea);
        Level secondLevel = new Level(2, secondFloorArea);
        Level firstLevel = new Level(1, firstFloorArea);

        allLevels[0] = thirdLevel;
        allLevels[1] = secondLevel;
        allLevels[2] = firstLevel;

        return allLevels;
    }
}
