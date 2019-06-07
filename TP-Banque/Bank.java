import Account.Account;
import Owner.Owner;

import java.util.ArrayList;

public final class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Owner> owners;
    private ArrayList<Transfer> transfers;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.owners = new ArrayList<>();
        this.transfers = new ArrayList<>();
    }

    // Accounts
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    // Owners
    public void addOwner(Owner owner) {
        this.owners.add(owner);
    }

    // Transferts
    public void addTransfert(Account credit, Account debit, float amount) {
        this.transfers.add(new Transfer(credit, debit, amount));
    }

    public void applyTransferts() {
        for (Transfer transfer : this.transfers) {
            try {
                transfer.applyTransfert();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Others
    public void applyBankingInterest() {
        for(Account account : this.accounts) {
            account.applyBankingInterest();
        }
    }

    public ArrayList<Owner> searchOwnerByName(String name) {

        ArrayList<Owner> results = new ArrayList<>();
        for (Owner owner : this.owners) {
            if (owner.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(owner);
            }
        }

        return results;
    }

    public ArrayList<Account> searchBankAccountByOwner(Owner owner) {
        return owner.getAccounts();
    }

    public ArrayList<Account> searchNegativeBankAccount() {

        ArrayList<Account> results = new ArrayList<>();
        for (Account account : this.accounts) {
            if (account.getBalance() < 0) {
                results.add(account);
            }
        }

        return results;
    }

    public float getTotalBalance(Owner owner) {

        float sum = 0;
        for (Account account : owner.getAccounts()) {
            sum += account.getBalance();
        }

        return sum;
    }
}
