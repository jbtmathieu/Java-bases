public abstract class Owner {
    //members
    protected String name;
    protected EnumOwner type;
    protected String address;

    //constr
    public Owner(String name, EnumOwner type, String address) {
        this.name = name;
        this.type = type;
        this.address = address;
    }

    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumOwner getType() {
        return type;
    }

    public void setType(EnumOwner type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //other


    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", address='" + address + '\'' +
                '}';
    }
}
