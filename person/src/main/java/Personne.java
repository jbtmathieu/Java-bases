public class Personne {
    private String name;



    public Personne(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public void comparer(Personne p){
        if (p.getName()== this.getName()) {
            System.out.print("Homonyme");

        }else {
            System.out.print("Différent");
        }
    }



}
