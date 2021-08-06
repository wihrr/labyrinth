package com.viktoria.labirinth;

import java.util.List;

public class Prince extends Person {


    private LabyrinthPoint targetPoint;

    private PathFinder pathFinder;

    public Prince(LabyrinthPoint currentPoint) {
        super(currentPoint);
        this.pathFinder = new PathFinder();
    }

    public void setTargetPoint(LabyrinthPoint targetPoint) {
        this.targetPoint = targetPoint;
    }

    public int go(Labyrinth labyrinth) {
        int time = 0;

        Level targetLevel = targetPoint.getLevel();
        while (true) {
            Level level = getCurrentPoint().getLevel();

            if (level.equals(targetLevel)) {
                int princessFindTime = findPrincess();
                time = time + princessFindTime;
                return time;
            }

            List<AreaPosition> stairsDown = labyrinth.getStairsDown(level);
            AreaPosition currentPosition = getCurrentPoint().getPosition();
            Path minimumPath = pathFinder.findMinimumPath(currentPosition, stairsDown);
            int stepsTime = minimumPath.getTime();
            time = time + stepsTime;

            Level bottomLevel = labyrinth.getBottomLevel(level);
            AreaPosition targetPosition = minimumPath.getTargetPosition();
            LabyrinthPoint newPoint = new LabyrinthPoint(bottomLevel, targetPosition);

            changePoint(newPoint);
            time += Path.TIME_PER_STEP;
        }
    }

    public int findPrincess() {
        Path minimumPath = pathFinder.findMinimumPath(getCurrentPoint().getPosition(), targetPoint.getPosition());
        return minimumPath.getTime();
    }
}
