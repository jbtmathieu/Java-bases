public class Main {

    public static void main (String[]args){
        //Exercice 4
        /*
        Carte card1 = new Carte("Spade",(short)8);
        Carte card2 = new Carte("Club",(short)6);
        Carte card3 = new Carte("Heart",(short)5);

        /*
        card1.setColor("Spade");
        card1.setValue((short)8);
        card2.setColor("Club");
        card2.setValue((short)10);
        card3.setColor("Heart");
        card3.setValue((short)6);
        */
/*
        System.out.println(card1.getColor()+" "+card1.getValue());
        System.out.println(card2.getColor()+" "+card2.getValue());
        System.out.println(card3.getColor()+" "+card3.getValue());

*/

        //Exercice 5 jeu 52 + mélange
        Deck d = new Deck();
        d.afficher();
        d.melanger();
        d.afficher();
        Deck d2 = d.diviser();
        d.afficher();
        d2.afficher();




    }


        /*public static boolean comparaison (String nomP1, String nomP2){
            ;
        }*/


}