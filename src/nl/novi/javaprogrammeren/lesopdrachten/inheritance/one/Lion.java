package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Lion extends Wild {
    private int children;

    public Lion(String name, char sex, String food, int cageNumber, String lastFed, String origin, int children) {
        super(name, sex, food, cageNumber, lastFed, origin);
        this.children = children;
    }

    // ------------------ GETTERS -----------------------------------

    public int getChildren() {
        return children;
    }

    // ------------------ SETTERS -----------------------------------

    public void setChildren(int children) {
        this.children = children;
    }

    // ------------------ METHODS -----------------------------------

    public void makeNoise(){
        System.out.println("Brul Brul");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "children=" + children +
                "} " + super.toString();
    }
}
//
//    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
//        herkomst op en de hoeveelheid kinderen.