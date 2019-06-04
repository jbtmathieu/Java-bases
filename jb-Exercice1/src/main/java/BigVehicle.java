public class BigVehicle extends Vehicle{
    //members
    protected float volume;


    //constr
    public BigVehicle(String model, String year, float price, String registration, char permis, float volume) {
        super(model, year, price, registration, permis);
        this.volume = volume;
        System.out.println("Big Vehicle created.");
    }

    public BigVehicle(Vehicle vehicle, float volume) {
        super(vehicle.getModel(), vehicle.getYear(), vehicle.getPrice(), vehicle.getRegistration(), 'C');
        this.volume=volume;
        System.out.println("Big Vehicle created.");
    }

    //set get
    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

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

    //other
    public void view(){
        super.viewF();
        System.out.println("Volume : "+volume);
    }
}