package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.List;
import java.util.ArrayList;

public class BirdOwner {
    private String name;
    private char sex;
    private static List<Bird> birdList;

    public BirdOwner(String name, char sex) {
        this.name = name;
        this.sex = sex;
        birdList = new ArrayList<>();
    }

    public void setBirdList(List<Bird> birdList) {
        BirdOwner.birdList = birdList;
    }

    // -------------- GETTERS ------------------

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public List<Bird> getBirdList() {
        return birdList;
    }

    // ---------- SETTERS --------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // ---------- METHODS --------------------

    public static void addBird(Bird bird) {
        birdList.add(bird);
    }

}
