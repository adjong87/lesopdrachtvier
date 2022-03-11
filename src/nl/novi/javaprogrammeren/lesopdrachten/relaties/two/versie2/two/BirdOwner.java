package nl.novi.javaprogrammeren.lesopdrachten.relaties.two.versie2.two;

import java.util.ArrayList;
import java.util.List;

public class BirdOwner {
    private static int ringNumber;
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
//
//    public static void addBird(String nickname, String species, int ringNumber) {
//        if (getBirdList().get().getRingNumber().contains(ringNumber) == true) {
//
//            System.out.println(nickname + ringNumber);
//            System.out.println("Deze is al gebird!");
//            break;
//        }
//            else{
//            Bird bird = new Bird(nickname, species, ringNumber);
//            birdList.add(bird);
//        }
//    }
//
    public static void addBird(String nickname, String species, int ringNumber) {
        if (BirdOwner.getBirdList().size() > 1) {
            int i = 0;
            while (i <= BirdOwner.getBirdList().size() - 1) {
                int k = BirdOwner.getBirdList().get(i).getRingNumber();
                    while (k != ringNumber) {
                    System.out.println("test");
                    i++;
                } else {
                    System.out.println("reeds gebird");
                    break;
                }
            }
        } else {
            Bird bird = new Bird(nickname, species, ringNumber);
            birdList.add(bird);
        }
    }


    public String toString() {
        return getName() + getSex() + getBirdList();
    }


}