public class Carte {
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
