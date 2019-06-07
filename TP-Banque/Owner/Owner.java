package Owner;

import Account.Account;

import java.util.ArrayList;

public abstract class Owner {

    protected String name;
    protected String address;
    protected ArrayList<Account> accounts;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + this.getType() + '\'' +
                '}';
    }
}
