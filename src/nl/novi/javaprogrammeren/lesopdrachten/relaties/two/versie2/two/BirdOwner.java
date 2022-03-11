package nl.novi.javaprogrammeren.lesopdrachten.relaties.two.versie2.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {
    private String name;
    private char sex;
    private static List<Bird> birdList;

    public BirdOwner(String name, char sex) {
        this.name = name;
        this.sex = sex;
        birdList = new ArrayList<>();
    }

//    public void setBirdList(List<Bird> birdList) {
//        BirdOwner.birdList = birdList;
//    }

    /// ^^ volgens mij doen we daar niks mee


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
    public void addBird(String nickname, String species, int ringNumber){
        Bird bird = new Bird(nickname, species, ringNumber);
        birdList.add(bird);
    }


    public String toString(){
        return getName() + getSex() + getBirdList();
    }

}

