public class Main {
    public Main() {
    }

        public static void main (String[]args){
            Personne p1 = new Personne("Matthieu");
            Personne p2 = new Personne("Mathilde");
            Personne p3 = new Personne("Robin");

            p2.setName("Jean Baptiste");
            System.out.println(p1.getName());

            p1.comparer(p2);
        }


        /*public static boolean comparaison (String nomP1, String nomP2){
            ;
        }*/


}
