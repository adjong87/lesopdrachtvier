package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import static nl.novi.javaprogrammeren.lesopdrachten.relaties.two.BirdOwner.*;

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
        Bird papegaai = new Bird("Lorre", "speciale papegaai", 666);
        Bird specht = new Bird("Woody", "woodpecker", 420);
        Bird nachtegaal = new Bird("gaaltje", "nachtegaal", 419);
        Bird merel = new Bird("Merel", "merel", 418);
        Bird dodo = new Bird("Dodo", "dodo", 417);
        Bird mus = new Bird("Elon", "mus", 416);
        Bird mus1 = new Bird("Elon1", "mus", 415);
        Bird mus2 = new Bird("Woody2", "mus", 414);
        Bird mus3 = new Bird("Woody3", "mus", 413);
        Bird mus4 = new Bird("Woody4", "mus", 412);
        Bird mus5 = new Bird("Woody5", "mus", 411);
        Bird mus6 = new Bird("Woody6", "mus", 410);
        Bird mus7 = new Bird("Woody66", "mus", 409);
        BirdOwner jente = new BirdOwner("Jente", 'f');
        BirdOwner.addBird(specht);
        BirdOwner.addBird(papegaai);
    }

}
