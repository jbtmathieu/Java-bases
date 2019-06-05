import java.util.*;

public class Bank {
    //members
    protected Set<Owner> clients;
    protected ArrayList<BankAccount> comptes;
    //constr

    public Bank() {
        this.clients = new HashSet<Owner>();
        this.comptes = new ArrayList<BankAccount>();
    }

    //set get
    public Set<Owner> getClients() {
        return clients;
    }

    public void setClients(Set<Owner> clients) {
        this.clients = clients;
    }
//other

    public boolean populate() {
        Person person=new Person("Dupont",EnumOwner.Person,"5,Rue Duval");
        Person personb=new Person("Smith",EnumOwner.Person,"4 Downroad Street");
        Person personc=new Person("Duschmol",EnumOwner.Person,"25, Boulevard du Pont");
        clients.add(person);
        clients.add(personb);
        clients.add(personc);

        LDD ldd= new LDD()


    }
}
