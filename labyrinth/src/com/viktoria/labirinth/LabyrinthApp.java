package com.viktoria.labirinth;

public class LabyrinthApp {

    public static void main(String[] args) {
        Level[] levels = LevelDesigner.getLevels();
        Labyrinth labyrinth = new Labyrinth(levels);
        Prince prince = labyrinth.getPrince();
        if (prince == null) {
            System.out.println("There is no Prince in the Labyrinth. Game Over!");
            System.exit(0);
        }

        Person princess = labyrinth.getPrincess();
        if (princess == null) {
            System.out.println("There is no Princess in the Labyrinth. Game Over!");
            System.exit(0);
        }

        prince.setTargetPoint(princess.getCurrentPoint());
        int time = prince.go(labyrinth);

        System.out.println("The road took " + time + " seconds.");
    }
}
