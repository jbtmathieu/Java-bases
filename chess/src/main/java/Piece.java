public abstract class Piece {
    //members
    protected boolean color;
    protected Coordinate coordinate;
    protected char symbol;

    //constr

    public Piece(boolean color, Coordinate coordinate) {
        this.color = color;
        this.coordinate = coordinate;
    }
    //set get

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setCoordinate(String string) {

        if (string.indexOf(";") != 0 && string.length()>=3) {
            this.coordinate.setAbscissa(Integer.valueOf(string.substring(0, string.indexOf(";"))));
            this.coordinate.setOrdinate(Integer.valueOf(string.substring(string.indexOf(";") + 1, string.length())));
        }
    }


    //other


    public abstract boolean positionPossible(Coordinate position);

    public void deplacement(Coordinate position){
        if(this.positionPossible(position)) setCoordinate(position);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color=" + color +
                ", coordinate=" + coordinate +
                ", symbol=" + symbol +
                '}';
    }
}
