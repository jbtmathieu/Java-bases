public class Main {
    public static void main(String[] args) {
        System.out.println("START");

        Rectangle rectangle = new Rectangle(7,12.5f,13.4f);
        System.out.println(rectangle.toString());
        Square square = new Square(7, 16.3f);
        System.out.println(square.toString());
        Circle circle = new Circle( 8, 10.1f);
        System.out.println(circle.toString());

        Rectangle rectangle2=new Rectangle(9,15f,15f);
        System.out.println(rectangle2.toString());
        System.out.println("Is it a square? "+rectangle2.isASquare());

        System.out.println("Does rectangle and square have the same center? "+rectangle.sameCenter(square)); // Yes expected

        System.out.println("Does rectangle2 and circle have the same center? "+rectangle2.sameCenter(circle)); // No

        //save

    }
}
