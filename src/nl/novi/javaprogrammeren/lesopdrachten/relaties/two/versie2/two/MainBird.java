package nl.novi.javaprogrammeren.lesopdrachten.relaties.two.versie2.two;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {
        BirdOwner jente = new BirdOwner("Jente", 'f');
        jente.addBird("specht", "Woodpecker", 123);
        jente.addBird("Lorre", "speciale papegaai", 124);
        jente.addBird("Woody", "woodpecker", 125);
        jente.addBird("gaaltje", "nachtegaal", 164);
        jente.addBird("Merel", "merel", 432);
        jente.addBird("Dodo", "dodo", 654);
        jente.addBird("Elon", "mus", 867);
        jente.addBird("Elon1", "mus", 888);
        jente.addBird("Woody2", "mus", 127);
        jente.addBird("Woody3", "mus", 413);
        jente.addBird("Woody4", "mus", 412);
        jente.addBird("Woody5", "mus", 411);
        jente.addBird("Woody6", "mus", 410);
        jente.addBird("Woody66", "mus", 409);
        jente.addBird("Woody66", "mus", 666);


        System.out.println("Dit is " + jente.getName()+ ", eigenaresse van de volgende lijst vogels" + BirdOwner.getBirdList());


    }

}
