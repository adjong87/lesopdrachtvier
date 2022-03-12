package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Wolf extends Wild{
    private String pack;

    public Wolf(String name, char sex, String food, int cageNumber, String lastFed, String origin, String pack) {
        super(name, sex, food, cageNumber, lastFed, origin);
        this.pack = pack;
    }

// ------------------ GETTERS -----------------------------------

    public String getPack() {
        return pack;
    }

    // ------------------ SETTERS -----------------------------------

    public void setPack(String pack) {
        this.pack = pack;
    }

    // ------------------ METHODS -----------------------------------

    public void makeNoise(){
        System.out.println("aaaaahhoooooooooeeeeeeee");
    }
}



//
//    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
//        herkomst op. Ook willen we de naam van de roedel weten.
