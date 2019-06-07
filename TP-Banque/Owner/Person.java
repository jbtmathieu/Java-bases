package Owner;

public final class Person extends Owner {

    private String birthDate;

    public Person(String name, String address, String birthDate) {
        super(name, address);

        this.birthDate = birthDate;
    }

    @Override
    public String getType() {
        return "Person";
    }
}
