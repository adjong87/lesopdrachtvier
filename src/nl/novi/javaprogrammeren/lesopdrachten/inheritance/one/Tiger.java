package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Tiger extends Wild{
    private final int stripes;

    public Tiger(String name, char sex, String food, int cageNumber, String lastFed, String origin, int stripes) {
        super(name, sex, food, cageNumber, lastFed, origin);
        this.stripes = stripes;
    }

    // ------------------ GETTERS -----------------------------------

    public int getStripes() {
        return stripes;
    }

    // ------------------ METHODS -----------------------------------

    public void makeNoise(){
        System.out.println("Grrrrrrr");
    }
}

//
//    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
//        herkomst op. Ook willen we het aantal strepen weten.