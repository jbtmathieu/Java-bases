public class Knight extends Piece{
    //members

    //constr

    public Knight(boolean color, Coordinate coordinate) {
        super(color, coordinate);
        super.setSymbol('C');
    }

    //set get
    @Override
    public boolean isColor() {
        return super.isColor();
    }

    @Override
    public void setColor(boolean color) {
        super.setColor(color);
    }

    @Override
    public Coordinate getCoordinate() {
        return super.getCoordinate();
    }

    @Override
    public boolean positionPossible(Coordinate position) {
        if (super.coordinate != position) {
            if ((((position.getAbscissa() - super.getCoordinate().getAbscissa()) == 0) || (position.getOrdinate() - super.getCoordinate().getOrdinate()) == 0)){
                return true;
            } else {
                if ((position.getAbscissa() - super.getCoordinate().getAbscissa()) == position.getOrdinate() - super.getCoordinate().getOrdinate()){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //other


}
