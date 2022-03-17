package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Animal {
    private String name;
    private char sex;
    private String food;

    public Animal(String name, char sex, String food) {
        this.name = name;
        this.sex = sex;
        this.food = food;
    }

    // ------------------ GETTERS -----------------------------------

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setFood(String voedsel) {
        this.food = voedsel;
    }

    // ------------------ METHODS -----------------------------------

    public void move(){
        System.out.println(" is 50 centimeter verplaatst");
    }

    public void sleep(){
        System.out.println("Ik heb 8 uur geslapen, ik ben topfit!");
    }

    public void eat(String voedsel) {
        System.out.println("ik eet " + voedsel);
    }

    public String toString() {
        return getName() + getFood() + getSex();
    }
}
