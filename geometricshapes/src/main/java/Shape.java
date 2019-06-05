public abstract class Shape {
    //members
    protected int center;

    //constr

    public Shape(int center) {
        this.center = center;
    }


    //set get

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    //other
    public abstract float getArea();
    public abstract float getPerimeter();

    public boolean sameCenter(Shape shape) {
        return (shape.getCenter()==this.center);
    }
    @Override
    public String toString() {
        return this.getClass().getName()+'{'+
                "center=" + center +"; "+
                "Area : "+ getArea()+"; "+
                "Perimeter : "+ getPerimeter()+"; "+
                '}';
    }
}
