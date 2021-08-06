package com.viktoria.labirinth;

import java.util.List;
import java.util.Random;

public class PathFinder {

    public Path findMinimumPath(AreaPosition currentPosition, List<AreaPosition> allTargetPositions) {
        for (AreaPosition position : allTargetPositions) {
            if (currentPosition.equals(position)) {
                Path path = new Path(currentPosition, 0);
                return path;
            }
        }

        AreaPosition firstPosition = allTargetPositions.get(0);
        Path minPath = findMinimumPath(currentPosition, firstPosition);

        for (AreaPosition nextPosition : allTargetPositions) {
            Path newPath = findMinimumPath(currentPosition, nextPosition);
            if (newPath.isShorter(minPath)) {
                minPath = newPath;
            }
        }

        return minPath;
    }

    public Path findMinimumPath(AreaPosition currentPosition, AreaPosition targetPosition) {
        // Здесь должен быть волновой алгорим поиска минимального пути.
        // Но пока он не реализован - метод возвращает рандом от 0 до 10

        Random random = new Random();
        int steps = random.nextInt(10);
        return new Path(targetPosition, 0);
    }
}
