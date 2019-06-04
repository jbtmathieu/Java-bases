public final class Bus extends BigVehicle{
    //members
    int passengersCapacity;


    //constr
    public Bus(String model, String year, float price, String registration, char permis, float volume, int passengersCapacity) {
        super(model, year, price, registration, permis, volume);
        this.passengersCapacity = passengersCapacity;
        System.out.println("Bus created.");
    }
        //param
    public Bus(BigVehicle bigVehicle, int passengersCapacity) { //
        super(bigVehicle.getModel(), bigVehicle.getYear(), bigVehicle.getPrice(), bigVehicle.getRegistration(),'C', bigVehicle.getVolume());
        this.passengersCapacity = passengersCapacity;
        System.out.println("Bus created.");
    }

    public Bus(Vehicle vehicle, float volume,int passengersCapacity) {
        super(vehicle.getModel(), vehicle.getYear(), vehicle.getPrice(), vehicle.getRegistration(),'C', volume);
        this.passengersCapacity = passengersCapacity;
        System.out.println("Bus created.");
    }



    // set get

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
// codage 9.
    public void view(){
        super.viewF();
        System.out.println("Capacity : "+passengersCapacity+" "+"Passengers.");
    }
// codage 7.

    public boolean canCarry(float volume,int passengersCapacity){
        boolean cond = (super.volume >= volume && this.passengersCapacity >= passengersCapacity)? true : false;
        return cond;
    }

}
