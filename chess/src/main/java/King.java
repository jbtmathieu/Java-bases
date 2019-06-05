public class King extends Piece{
    //members

    //constr

    public King(boolean color, Coordinate coordinate) {
        super(color, coordinate);
        super.setSymbol('R');
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
        if ((((position.getAbscissa()- super.getCoordinate().getAbscissa()) == -1)
                || ((position.getAbscissa()- super.getCoordinate().getAbscissa()) == 0)
            || ((position.getAbscissa()- super.getCoordinate().getAbscissa()) == 1))
            && ((position.getOrdinate()- super.getCoordinate().getOrdinate() == -1)
                || (position.getOrdinate()- super.getCoordinate().getOrdinate()) == 0)
            || (position.getOrdinate()- super.getCoordinate().getOrdinate()) == 1 ) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //other


}
