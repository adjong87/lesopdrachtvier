package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends Pets{
    private boolean insideCat;

    public Cat(String name, char sex, String food, Owner owner, String brand, String breed, boolean insideCat) {
        super(name, sex, food, owner, brand, breed);
        this.insideCat = insideCat;
    }

    // ------------------ GETTERS -----------------------------------

    public boolean isInsideCat() {
        return insideCat;
    }

    // ------------------ SETTERS -----------------------------------

    public void setInsideCat(boolean insideCat) {
        this.insideCat = insideCat;
    }

    // ------------------ METHODS -----------------------------------

    public void makeNoise(){
        System.out.println("Miauw");
    }

}



//Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
//        of het een binnen of buitenkat is.