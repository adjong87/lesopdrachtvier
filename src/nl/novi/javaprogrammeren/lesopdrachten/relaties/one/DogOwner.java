package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex, Dog dog) {
        this.name = name;
        this.sex = sex;
        this.dog = dog;
    }


// ---------------------  GETTERS

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Dog getDog() {
        return dog;
    }

    // --------------------- setters
    public void setName(String naam) {
        this.name = naam;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

// ----------------- methods

    public String toString() {
        return name + " heeft een " + getDog().getSex() + " deze is " + getDog().getAge() + " jaar oud en van het soort " + getDog().getSpecies() + ". De hond heet " + getDog().getName() + ".";
    }

    public void changeName(String newName){
        this.dog.setName(newName);
    }

    public void increaseAge(){
        this.dog.setAge((dog.getAge())+1);
    }
}

