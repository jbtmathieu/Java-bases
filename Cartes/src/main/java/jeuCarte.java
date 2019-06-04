public class jeuCarte {
    private Carte carte[];
    private String valueSet[];
    private String colorSet[];
    int i=0,j=0;

    public jeuCarte(int number) {
        if (number % 4 != 0) {
               // pas un deck complet
            }else {
            carte = new Carte[number];
            for(i=0;i<4;i++){
                System.out.println("i:"+i);
                for (j=0;j<13;j++){
                    //carte[j]= colorSet[i]+ valueSet[j];
                    System.out.println("j:"+j);
                    System.out.println(colorSet[i]+ valueSet[j]);
                }
            }

        }
        }


    public void getCarte() {

    }

    public void setCarte(Carte[] carte) {
        this.carte = carte;
    }
}
