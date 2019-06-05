public class Rectangle extends Shape {
    //members
    private float width;
    private float height;

    //constr

    public Rectangle(int center, float width, float height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    //get set

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //other

    public float getArea(){

        return width*height;
    }
    public float getPerimeter(){
        return (width+height)*2;
    }

    public boolean isASquare(){
        return (width==height);
    }



    @Override
    public String toString() {
        return super.toString()+
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
