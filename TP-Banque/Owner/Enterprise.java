package Owner;

public final class Enterprise extends Owner {

    private String manager;

    public Enterprise(String name, String address, String manager) {
        super(name, address);

        this.manager = manager;
    }

    @Override
    public String getType() {
        return "Enterprise";
    }
}
