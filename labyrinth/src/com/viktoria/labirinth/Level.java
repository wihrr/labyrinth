package com.viktoria.labirinth;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Level {

    private int order;

    private char[][] area;

    public Level(int order, char[][] area) {
        this.order = order;
        this.area = area;
    }

    public int getOrder() {
        return order;
    }

    public boolean isFirst() {
        return order == 1;
    }

    public Prince findPrince() {
        AreaPosition position = getPositionForObject(LevelDesigner.PRINCE);
        if (position != null) {
            LabyrinthPoint labyrinthPoint = new LabyrinthPoint(this, position);
            Prince prince = new Prince(labyrinthPoint);
            return prince;
        }

        return null;
    }

    public Princess findPrincess() {
        AreaPosition position = getPositionForObject(LevelDesigner.PRINCESS);
        if (position != null) {
            LabyrinthPoint labyrinthPoint = new LabyrinthPoint(this, position);
            Princess princess = new Princess(labyrinthPoint);
            return princess;
        }

        return null;
    }

    public List<AreaPosition> getAllStairs() {
        List<AreaPosition> allDownStairs = new ArrayList<>();
        for (int i = 0; i < area.length; i++) {

            char[] row = area[i];
            for (int j = 0; j < row.length; j++) {
                if (area[i][j] == LevelDesigner.DOT) {
                    AreaPosition position = new AreaPosition(i, j);
                    allDownStairs.add(position);
                }
            }
        }

        return allDownStairs;
    }

    private AreaPosition getPositionForObject(char objType) {
        for (int i = 0; i < area.length; i++) {

            char[] row = area[i];
            for (int j = 0; j < row.length; j++) {
                if (area[i][j] == objType) {
                    AreaPosition position = new AreaPosition(i, j);
                    return position;
                }
            }
        }

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return order == level.order;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order);
    }
}
