package com.viktoria.labirinth;

public class Person {

    private LabyrinthPoint currentPoint;

    public Person(LabyrinthPoint currentPoint) {
        this.currentPoint = currentPoint;
    }

    public LabyrinthPoint getCurrentPoint() {
        return currentPoint;
    }

    public void changePoint(LabyrinthPoint newPoint) {
        currentPoint = newPoint;
    }
}
