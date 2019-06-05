public class Square extends Shape {
    //members
    protected float length;

    //const

    public Square(int center, float length) {
        super(center);
        this.length=length;
    }

    //get set


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    //other
    public float getArea() {
        return length*length;
    }

    public float getPerimeter() {
        return length*4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "length=" + length +
                '}';
    }
}
