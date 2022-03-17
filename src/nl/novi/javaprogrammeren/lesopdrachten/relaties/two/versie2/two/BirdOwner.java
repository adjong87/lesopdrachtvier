package nl.novi.javaprogrammeren.lesopdrachten.relaties.two.versie2.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {
    private static int ringNumber;
    private String name;
    private char sex;
    private static List<Bird> birdList;
    private static List<Integer>ringNummers;

    public BirdOwner(String name, char sex) {
        this.name = name;
        this.sex = sex;
        birdList = new ArrayList<>();
        ringNummers = new ArrayList<>();
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

    public static List<Bird> getBirdList() {
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

    public static void addBird(String nickname, String species, int ringNumber) {
            if (ringNummers.contains(ringNumber)){
                System.out.println("reeds gebird");
            }
            else {
                Bird bird = new Bird(nickname, species, ringNumber);
                birdList.add(bird);
                ringNummers.add((ringNumber));
            }
        }

    public String toString() {
        return "\n\r Eigenaar: " + getName() + BirdOwner.getBirdList();
    }





}