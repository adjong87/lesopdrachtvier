package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Wild extends Animal{
    private int cageNumber;
    private String lastFed;
    private String origin;

    public Wild(String name, char sex, String food, int cageNumber, String lastFed, String origin) {
        super(name, sex, food);
        this.cageNumber = cageNumber;
        this.lastFed = lastFed;
        this.origin = origin;
    }

    // ------------------ GETTERS -----------------------------------

    public int getCageNumber() {
        return cageNumber;
    }

    public String getLastFed() {
        return lastFed;
    }

    public String getOrigin() {
        return origin;
    }

    // ------------------ SETTERS -----------------------------------

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
