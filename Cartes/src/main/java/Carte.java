/*public class Carte {
    String color;
    short value;

    // construct
    public Carte(String color, short value) {
        this.color = color;
        this.value = value;
    }

    //color getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //value Getter Setter
    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }
}
*/


public class Carte {
    private int _valeur;
    private String _couleur;

    public Carte(int valeur, String couleur) {
        _valeur = valeur;
        _couleur = couleur;
    }

    public int getValeur() {
        return _valeur;
    }

    public String getCouleur() {
        return _couleur;
    }
}