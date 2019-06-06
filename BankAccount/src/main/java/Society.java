public class Society extends Owner {
    //members
    protected String birthDate;


    public Society (String name, String address) {
        super(name, EnumOwner.Society, address);
    }
}