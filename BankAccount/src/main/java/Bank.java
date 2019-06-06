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

    public ArrayList<BankAccount> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<BankAccount> comptes) {
        this.comptes = comptes;
    }

    //other

    public boolean populate() {
        Person person=new Person("Dupont","5,Rue Duval");
        Person personb=new Person("Smith","4 Downroad Street");
        Person personc=new Person("Duschmol","25, Boulevard du Pont");

        Society society = new Society("OZM", "54, grande rue");
        clients.add(person);
        clients.add(personb);
        clients.add(personc);
        clients.add(society);

        LDD ldd= new LDD(person);
        ldd.setAmount(-5.0f);
        LEP lep= new LEP(person);
        lep.setAmount(-22.0f);
        CheckAccount checkAccount= new CheckAccount(person);
        LDD ldd2= new LDD(personb);
        ldd2.setAmount(-7.0f);
        CheckAccount checkAccountb= new CheckAccount(personb);
        checkAccount.setAmount(1000.0f);
        CheckAccount checkAccountc = new CheckAccount(personc);
        checkAccountc.setAmount(250.0f);
        CheckAccount checkAccountd = new CheckAccount(society);
        checkAccountd.setAmount(2500.0f);

        comptes.add(ldd);
        comptes.add(lep);
        comptes.add(ldd2);
        comptes.add(checkAccount);
        comptes.add(checkAccountb);
        comptes.add(checkAccountc);
        comptes.add(checkAccountd);

        if (clients.size()>0 && comptes.size()>0) return true;
        else return false;
    }


    // 5.
    public void applyInterest(){
        for ( int i = 0; i < comptes . size () ; i++) {
          /*  for(Comptes:this.comptes){
                //compte.appliquerInterets();
            } */
            if (comptes.get(i) != null && comptes.get(i) instanceof LDD) {
                ((LDD) comptes.get(i)).interestPayment();
            }
        }
    }

    public Set<Owner> searchOwner(Owner owner) {
        //if (owner == null) return null;

        Set<Owner> result = new HashSet<Owner>();
        Iterator it = clients.iterator();
        while (it.hasNext()) {
            if (it.next().toString().contains(owner.getName())) {
                result.add(owner);
                //System.out.println(it.next());

            }
        }
        return result;
    }

    public ArrayList<BankAccount> searchAccount (Owner owner){
        //if (owner == null) return null;
        ArrayList<BankAccount> result = new ArrayList<BankAccount>();

        for (int i =0; i<clients.size();i++) {
            if (comptes.get(i).getOwner().equals(owner)) {
                result.add(comptes.get(i));
                System.out.println(i);
                System.out.println(comptes.get(i).getOwner());
                }
            }
        return result;
    }

    public ArrayList<BankAccount> negativeAccounts() {
        ArrayList<BankAccount> result = new ArrayList<BankAccount>();

        for (int i =0; i<clients.size();i++) {
            if (comptes.get(i).getAmount() < 0 ) {
                result.add(comptes.get(i));
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "\nclients=" + clients +
                ", \ncomptes=" + comptes +
                '}';
    }
}
