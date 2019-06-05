public class Circle extends Shape {
    //members
    private float radius;

    //constr

    public Circle(int center, float radius) {
        super(center);
        this.radius = radius;
    }

    //get set

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //other

    public float getArea() {
        return (float) (3.1416*radius*radius);
    }

    public float getPerimeter() {
        return (float) (2*3.1416*radius);
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                "radius=" + radius +
                '}';
    }
}
