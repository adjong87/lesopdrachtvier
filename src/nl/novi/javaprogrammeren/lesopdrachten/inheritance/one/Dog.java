package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Dog extends Pets{
    private String nickName;

    public Dog(String name, char sex, String food, Owner owner, String brand, String breed, String nickName) {
        super(name, sex, food, owner, brand, breed);
        this.nickName = nickName;
    }

    // ------------------ GETTERS -----------------------------------

    public String getNickName() {
        return nickName;
    }

    // ------------------ SETTERS -----------------------------------

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    // ------------------ METHODS -----------------------------------

    public void makeNoise(){
        System.out.println("Woef Woef Woef");
    }

    @Override
    public void eat(String voedsel) {
       if(voedsel.equals(getBrand())) {
           System.out.println("WOEF WOEF JUMMIE MY FAVORITE WOEF!");
       }
       else{
           System.out.println("GRRRRRRRRRRRRRRRRRR GEEN " + getBrand());
       }
    }


    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                "} " + super.toString();
    }
}



//    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.