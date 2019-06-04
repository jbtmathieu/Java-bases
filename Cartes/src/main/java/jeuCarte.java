public class jeuCarte {
    private Carte carte[];

    public jeuCarte(int number) {
        if (number % 4 != 0) {
               // pas un deck complet
            }else {


            carte = new Carte[number];


        }
    }

    public Carte[] getCarte() {
        return carte;
    }

    public void setCarte(Carte[] carte) {
        this.carte = carte;
    }
}
