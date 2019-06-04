public class Car extends Vehicle{
    //members
    private boolean autoradio;


    //constr
    public Car(String model, String year, float price, String registration, char permis, boolean autoradio) {
        super(model, year, price, registration, permis);
        this.autoradio = autoradio;
        System.out.println("Car created.");
    }

    public Car(Vehicle vehicle, boolean autoradio) {
        super(vehicle.getModel(), vehicle.getYear(), vehicle.getPrice(), vehicle.getRegistration(),'B');
        this.autoradio = autoradio;
        System.out.println("Car created.");
    }

    //set get
    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(String year) {
        super.setYear(year);
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }

    @Override
    public String getRegistration() {
        return super.getRegistration();
    }

    @Override
    public void setRegistration(String registration) {
        super.setRegistration(registration);
    }



    public boolean isAutoradio() {
        return autoradio;
    }

    public void setAutoradio(boolean autoradio) {
        this.autoradio = autoradio;
    }
// 2.
    public void AddAutoradio() {
        this.autoradio = true;
    }
    public void RemoveAutoradio() {
        this.autoradio = false;
    }

    //other
    //codage 4.
    public void view(){
        super.viewF();
        System.out.println("Autoradio : "+autoradio);
    }



}
