package com.viktoria.labirinth;

import java.util.Objects;

public class LabyrinthPoint {

    private Level level;

    private AreaPosition position;

    public LabyrinthPoint(Level level, AreaPosition position) {
        this.level = level;
        this.position = position;
    }

    public Level getLevel() {
        return level;
    }

    public AreaPosition getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabyrinthPoint that = (LabyrinthPoint) o;
        return Objects.equals(level, that.level) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, position);
    }
}
