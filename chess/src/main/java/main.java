public class main {
    public static void main(String[] args) {

        //coordinate test
        Coordinate coordinate = new Coordinate(13,15);
        System.out.println(coordinate);

        Coordinate coordinate2 = new Coordinate("11;12");
        System.out.println(coordinate2);

        //King test
        King king = new King(true,coordinate2);
        System.out.println(king.toString());

        System.out.println(king.toString());
    }
}
