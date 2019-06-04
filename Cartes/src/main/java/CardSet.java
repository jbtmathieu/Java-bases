import java.util.Random;

public class CardSet {
    private Carte carte[];
    private String set[];
    private String valueSet[];
    private String colorSet[];


    public CardSet(int numb) {
        String valueSet[]= new String[numb/4];
        String number;
        int i=1;
        int j=0;

        //initialisation des faces des cartes
        do{
            valueSet[i]= String.valueOf(i+1);
            i++;
        } while (i<=10);
        valueSet[10]="Jack";
        valueSet[11]="Queen";
        valueSet[12]="King";
        valueSet[0]="As";

        //initialisation des couleurs
        colorSet= new String[] {"Spade", "Heart", "Diamond", "Club"};

        // Initialisation du jeu de cartes
        //set= new String[13][4];
        for(i=0;i<4;i++){
            System.out.println("i:"+i);
            for (j=0;j<13;j++){
                set[j]= colorSet[i]+ valueSet[j];
                System.out.println("j:"+j);
                System.out.println(colorSet[i]+ valueSet[j]);
                }
            }

    }

    public static boolean CardSetShuffle(){
        String[][] ShuffledSet = new String[13][4];
        /* if (!set){
            CardSet aCardset = new CardSet();
        }else {

            int rand1 = 0;
            int rand2 = 0;
            int cpt = 0;


            while (cpt < 52) {
                // générer un nombre aléatoire jusqu'à 4 et 13

           //     rand1.generateRandom(0, 12);
           //     rand2.generateRandom(0, 3);
                //si case vide copie de la carte
                if (ShuffledSet[rand1][rand2] == null) {
                    ShuffledSet[rand1][rand2] = set[rand1][rand2];
                    System.out.println("Valeur copié" + set[rand1][rand2] + "\nColor: " + rand2);
                } else {
                    //sinon case suivante

                }
                cpt++;
            }
        } */
    return true;
    }

    public static int generateRandom (int max){

        return generateRandom (0, max);
    }

    public static int generateRandom (int min,int max){
        Random rand= new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
