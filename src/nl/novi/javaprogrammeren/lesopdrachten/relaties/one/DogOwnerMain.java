package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwnerMain {

    /*
    Opdracht
    Geef de klasse Dog de volgende instance variables: name, species, age, sex. Datatypes mag je zelf verzinnen.
    De sex en species variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse DogOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op geters en setters.t

     is in dit geval de eigenaar.
    De DogOwner-klasse moet methodes bevatten om de naam van de hond aan te passen
    Programmeer de volgende relatie:
     Een DogOwner kan maximaal 1 Dog hebben.
      De DogOwner én de leeftijd met 1 te verhogen.

    Geef de DogOwner een toString()-methode en druk dit af:
    NAAM-DogOwner heeft een reu/teef, deze is xx jaar oud en van het soort: SOORT-Dog. De hond heet: NAAM-Dog

    Instantieer hieronder de objecten en laat zien dat je code werkt.
     */

    public static void main(String[] args) {

        Dog jente = new Dog("jente", "poedel", 28, "teef");
        System.out.println(jente);
        DogOwner arjen = new DogOwner("Arjen","Man",jente);
        System.out.println(arjen);
        arjen.getDog().setName("Johan");
        System.out.println(jente.getAge());
        arjen.changeName("Jente");
        System.out.println(arjen.getDog().getName());
        arjen.getDog().increaseAge();
        System.out.println(arjen.getDog().getAge());
        System.out.println(arjen);

    }

}
