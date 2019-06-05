public class Coordinate {
    //members
    protected int abscissa;
    protected int ordinate;

    //constr

    public Coordinate(int abscissa, int ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public Coordinate(String string) {
        if (string.indexOf(";") != 0 && string.length()>=3){

            this.abscissa = Integer.valueOf(string.substring(0,string.indexOf(";")));
            this.ordinate = Integer.valueOf(string.substring(string.indexOf(";")+1, string.length()));

        }
    }

        //set get
    public int getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(int abscissa) {
        this.abscissa = abscissa;
    }

    public int getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    //other


    @Override
    public String toString() {
        return "Coordinate{" +
                "abscissa=" + abscissa +
                ", ordinate=" + ordinate +
                '}';
    }
}
