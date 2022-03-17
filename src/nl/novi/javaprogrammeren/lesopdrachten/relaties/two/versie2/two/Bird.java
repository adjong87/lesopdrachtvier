package nl.novi.javaprogrammeren.lesopdrachten.relaties.two.versie2.two;

public class Bird {
    private String nickname;
    private final String species;
    private final int ringNumber;

    public Bird(String nickname, String species, int ringNumber) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
    }

    // -------------- GETTERS ------------------

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public int getRingNumber() {
        return ringNumber;
    }

    // ---------- SETTERS --------------------

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // ---------- METHODS --------------------

    public String toString() {
        return "\n\r Nickname: " + getNickname() + "\n\r Ringnummer: " + getRingNumber() + "\n\r";
    }
}
