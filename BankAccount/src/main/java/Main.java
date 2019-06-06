import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        boolean cond;

        Bank bank = new Bank();

        cond = bank.populate();
        System.out.println(cond);
        System.out.println(bank.toString());

        //5. Appliquer intérêts
        System.out.println("5.");
        bank.applyInterest();
        System.out.println(bank.toString());

        //Search
        Person person = new Person("Pierre", "645, bd du moulin");//new
        Person personb = new Person("Dupont", "5,Rue Duval"); //ft
        Person personc = new Person("Dupont", "25,Rue Duval");//ftmod
        Person persond = new Person("Du", ""); //multiple results
        Society society = new Society("OZM", "54, grande rue");

        Set<Owner> searchOwner = new HashSet<Owner>();

        System.out.println("dupont"+bank.searchOwner(personb));
        System.out.println("dupmod"+bank.searchOwner(personc));
        System.out.println("du"+bank.searchOwner(persond));
        System.out.println("society"+bank.searchOwner(society));

        Iterator it = searchOwner.iterator();
        searchOwner = bank.searchOwner(personc);
        it = searchOwner.iterator();
        System.out.println("Recherche de clients :");
        while (it.hasNext())
            System.out.println(it.next());



        // searchAccounts
        ArrayList<BankAccount> bankSearch = new ArrayList<BankAccount>();

        bankSearch = bank.searchAccount(personb);
        System.out.println("Recherche de compte :"+bankSearch.size());
        for ( int i = 0; i < bankSearch.size() ; i++) {
            System.out.println(bankSearch.get(i));
        }
        System.out.println(bank.getClients().size());
        System.out.println(bank.getComptes().size());



        ArrayList<BankAccount> bankSearch2 = new ArrayList<BankAccount>();

        bankSearch = bank.negativeAccounts();
        System.out.println("Recherche de comptes négatifs :"+bankSearch.size());
        for ( int i = 0; i < bankSearch.size() ; i++) {
            System.out.println(bankSearch.get(i));
        }








        /*
        System.out.println("Example");
        Set<Owner> set = new HashSet<Owner>();
        set.add(person);
        set.add(personb);
        set.add(personc);
        set.add(persond);
        System.out.println(" Taille de la map: " + set.size());
        Iterator ite = set.iterator();
        while (ite.hasNext())
            System.out.println(ite.next());
        set.remove(0);
        set.clear();
        if (set.contains(1)) {
            System.out.println("1 est contenu dans la map !");
        }
         */
    }
}
