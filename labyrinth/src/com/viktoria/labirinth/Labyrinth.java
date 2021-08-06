package com.viktoria.labirinth;

import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    private Level[] allLevels;

    public Labyrinth(Level[] allLevels) {
        this.allLevels = allLevels;
    }

    public Prince getPrince() {
        for (Level level : allLevels) {
            Prince prince = level.findPrince();
            if (prince != null) {
                return prince;
            }
        }

        return null;
    }

    public Princess getPrincess() {
        for (Level level : allLevels) {
            Princess princess = level.findPrincess();
            if (princess != null) {
                return princess;
            }
        }

        return null;
    }

    public List<AreaPosition> getStairsDown(Level level) {
        if (level.isFirst()) {
            throw new RuntimeException("You are on the FIRST LEVEL! There is no Stairs Down here!");
        }

        Level bottomLevel = getBottomLevel(level);

        List<AreaPosition> currentStairs = level.getAllStairs();
        List<AreaPosition> bottomStairs = bottomLevel.getAllStairs();

        List<AreaPosition> generalStairs = new ArrayList<>();

        for (AreaPosition upStair : currentStairs) {
            for (AreaPosition bottomStair: bottomStairs) {
                if (upStair.equals(bottomStair)) {
                    generalStairs.add(upStair);
                }
            }
        }

        return generalStairs;
    }

    public Level getBottomLevel(Level level) {
        if (level.isFirst()) {
            throw new RuntimeException("You are on the FIRST LEVEL! There is no Stairs Down here!");
        }

        int bottomOrder = level.getOrder() - 1;

        for (Level bottomLevel : allLevels) {
            if (bottomLevel.getOrder() == bottomOrder) {
                return bottomLevel;
            }
        }

        throw new RuntimeException("Can not find Bottom Level for Order = " + level.getOrder());
    }
}
