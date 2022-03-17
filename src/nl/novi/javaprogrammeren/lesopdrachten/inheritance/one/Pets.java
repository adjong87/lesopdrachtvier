package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Pets extends Animal {
    private Owner owner;
    private String brand;
    private String breed;

    public Pets(String name, char sex, String food, Owner owner, String brand, String breed) {
        super(name, sex, food);
        this.owner = owner;
        this.brand = brand;
        this.breed = breed;
    }

// ------------------ GETTERS -----------------------------------

    public Owner getOwner() {
        return owner;
    }

    public String getBrand() {
        return brand;
    }

    public String getBreed() {
        return breed;
    }

    // ------------------ SETTERS -----------------------------------

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    // ------------------ METHODS -----------------------------------

    public void move(){
        System.out.println(getName() + " is 25 centimeter verplaatst");
    }

    public String toString() {
        return getOwner() + getBrand() + getBreed();
    }
}


//    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een huisdier beweegt print je in
//    de console dat deze 0.25 is verplaatst. Bij alle andere dieren is dat 0.50.