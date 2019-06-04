public class Truck extends BigVehicle{
    //members

    //constr

    public Truck(String model, String year, float price, String registration, char permis, float volume) {
        super(model, year, price, registration,  permis, volume);
        System.out.println("Truck created.");
    }

    public Truck(BigVehicle bigVehicle) { //
        super(bigVehicle.getModel(), bigVehicle.getYear(), bigVehicle.getPrice(), bigVehicle.getRegistration(),'C', bigVehicle.getVolume());
        System.out.println("Truck created.");
    }

    public Truck(Vehicle vehicle, float volume) {
        super(vehicle, volume);
        System.out.println("Truck created.");
    }

    //set get

    @Override
    public float getVolume() {
        return super.getVolume();
    }

    @Override
    public void setVolume(float volume) {
        super.setVolume(volume);
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
    //codage 8.
    public void view(){
        super.viewF();
    }
    // Codage 5.
    public boolean canCarry(float volume) {
        if (super.volume>=volume) return true;
        else return false;

        //return this.volume >= volume;

    }

}
