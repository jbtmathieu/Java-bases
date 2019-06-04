

public class Bataille {
    private Carte[] cartes;
    private Carte[] newCartes1;
    private Carte[] newCartes2;

    public Bataille(Deck deck) {
        cartes = new Carte[52];
        System.out.println(deck.getLength());
        for (int i=0;i<(deck.getLength());i++){
            System.out.println(cartes[i]);
            System.out.println(deck.getCarte(i));
            cartes[i] = deck.getCarte(i);
        }


        newCartes1 = new Carte[deck.getLength() / 2];
        newCartes2 = new Carte[deck.getLength() / 2 + deck.getLength() % 2];

        for (int i = 0; i < deck.getLength() / 2; i++) {
            newCartes1[i] = cartes[i];
        }

        for (int i = deck.getLength() / 2; i < deck.getLength(); i++) {
            newCartes2[i - deck.getLength() / 2] = cartes[i];
        }

    }


    public boolean run() {
        // remporter toutes les cartes de l'adversaire.
        System.out.println(newCartes1.length);
        System.out.println(newCartes2.length);
        int resteJ1 = newCartes1.length;
        int resteJ2 = newCartes2.length;
        while (resteJ1 != 0 || resteJ2 != 0)
            if (newCartes1[resteJ1].getValeur() > newCartes2[resteJ2].getValeur()) {
                System.out.println("Joueur 1 Gagne.");
                resteJ1--;
                resteJ2--;
            } else if (newCartes1[resteJ1].getValeur() > newCartes2[resteJ2].getValeur()) {
                System.out.println("Joueur 2 Gagne.");
                resteJ1--;
                resteJ2--;
            } else {
                System.out.println("Egalité.");
                resteJ1--;
                resteJ2--;
            }
    return true;
    }
}
