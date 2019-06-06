public class Person extends Owner{
    //members
    protected String birthDate;


    public Person(String name, String address) {
        super(name, EnumOwner.Person, address);
    }
}
