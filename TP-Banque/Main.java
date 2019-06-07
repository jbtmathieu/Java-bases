import Account.Account;
import Account.LddAccount;
import Account.LepAccount;
import Account.MainAccount;
import Owner.Enterprise;
import Owner.Owner;
import Owner.Person;

public class Main {

    public static void main(String[] args) throws Exception {

        // Création des propriétaires
        Enterprise enterprise = new Enterprise("Apple", "15 rue des pommes", "Tim Cook");
        Person person = new Person("Tim Cook", "15 rue des fleurs", "1960");

        // Création des comptes
        try {
            new LddAccount(enterprise, -100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        LddAccount ldd = new LddAccount(enterprise, 1000);
        LepAccount lep = new LepAccount(person, 5000);
        MainAccount main = new MainAccount(enterprise, 20000, 100);

        // Création de la banque
        Bank bank = new Bank();
        bank.addAccount(ldd);
        bank.addAccount(lep);
        bank.addAccount(main);
        bank.addOwner(enterprise);
        bank.addOwner(person);

        // Virement
        System.out.println("-----------------------------------------------------");
        main.virement(lep, 250);

        System.out.println(main);
        System.out.println(lep);


        // Versement LDD (Min, Max et Découvert)
        System.out.println("-----------------------------------------------------");

        try {
            main.virement(ldd, 20000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            main.virement(ldd, 15000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            main.virement(lep, 15000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Appliquer les interêts
        System.out.println("-----------------------------------------------------");
        System.out.println("Before:");
        System.out.println(ldd);
        System.out.println(lep);
        System.out.println(main);
        bank.applyBankingInterest();
        System.out.println("After:");
        System.out.println(ldd);
        System.out.println(lep);
        System.out.println(main);

        // Rechercher un propriétaire
        System.out.println("-----------------------------------------------------");
        for (Owner owner: bank.searchOwnerByName("App")) {
            System.out.println(owner);
        }

        // Compte d'un propriétaire
        System.out.println("-----------------------------------------------------");
        for (Account account: bank.searchBankAccountByOwner(enterprise)) {
            System.out.println(account);
        }

        // Compte à découvert
        System.out.println("-----------------------------------------------------");
        main.retirer(19750);
        for (Account account: bank.searchNegativeBankAccount()) {
            System.out.println(account);
        }

        // Solde total d'un propriétaire
        System.out.println("-----------------------------------------------------");
        System.out.println(bank.getTotalBalance(enterprise));

        // Virement Automatique
        System.out.println("-----------------------------------------------------");
        bank.addTransfert(ldd, main, 50);
        System.out.println("Before:");
        System.out.println(ldd);
        System.out.println(main);
        bank.applyTransferts();
        System.out.println("After:");
        System.out.println(ldd);
        System.out.println(main);
    }

}
