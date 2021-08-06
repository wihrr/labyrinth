package com.viktoria.labirinth;

public class Path {

    public static final int TIME_PER_STEP = 5;

    private AreaPosition targetPosition;

    private int stepsCount;

    public Path(AreaPosition targetPosition, int stepsCount) {
        this.targetPosition = targetPosition;
        this.stepsCount = stepsCount;
    }

    public AreaPosition getTargetPosition() {
        return targetPosition;
    }

    public void setTargetPosition(AreaPosition targetPosition) {
        this.targetPosition = targetPosition;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public boolean isShorter(Path otherPath) {
        return this.stepsCount < otherPath.stepsCount;
    }

    public int getTime() {
        return stepsCount * TIME_PER_STEP;
    }
}
