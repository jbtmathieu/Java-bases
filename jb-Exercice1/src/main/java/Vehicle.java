import java.io.PrintStream;

public class Vehicle {
    //members
    protected String model;
    protected String year;
    protected float price;
    protected String registration;
    protected char permis;

    //constr
    public Vehicle(String model, String year, float price, String registration, char permis) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.registration = registration;
        this.permis = permis;
        System.out.println("Vehicle created.");
    }

    //set get
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    //other
    // codage 3.


    // Codage 4.
    final public void viewF(){
        System.out.print("Model : "+model+" ");
        System.out.print("Year : "+year+" ");
        System.out.print("Price : "+price+" ");
        System.out.print("Registration : "+registration+" ");
        System.out.print("Licence : "+permis+" ");
    }

     public void view(){
         System.out.print("Model : "+model+" ");
         System.out.print("Year : "+year+" ");
         System.out.print("Price : "+price+" ");
         System.out.print("Registration : "+registration+" ");
         System.out.print("Licence : "+permis+" ");
    }

    //codage 6.
    public float RentingCost(String currentYear){
        float rentalDayCost =((Integer.parseInt(currentYear)-Integer.parseInt(this.year))<=1) ? this.price/200 : this.price/250;
        return rentalDayCost;

        //age()<1
    }

}
