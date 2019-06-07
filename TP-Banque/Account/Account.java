package Account;

import Owner.Owner;

public abstract class Account {

    private static int count = 1;

    private int id;
    protected float balance;
    protected Owner owner;
    protected float interest;

    public Account(Owner owner, float balance) throws Exception {

        if (balance < 0) {
            throw new Exception("Erreur, Le solde ne peut pas être négatif !");
        }

        this.id = count++;
        this.owner = owner;
        this.owner.getAccounts().add(this);
        this.balance = balance;
    }

    protected abstract void verser(float amount) throws Exception;

    protected abstract void retirer(float amount) throws Exception;

    public void virement(Account account, float amount) throws Exception {

        int taxe = 0;
        if (!this.owner.equals(account.getOwner())) {
            taxe = 1;
        }

        this.retirer(amount + taxe);

        try {
            account.verser(amount);
        } catch (Exception e) {

            // Annulation du débit
            this.verser(amount + taxe);

            // Suivie de l'exception
            throw e;
        }

    }

    public void applyBankingInterest() {
        this.balance *= (1 + this.interest / 100);
    }

    public Owner getOwner() {
        return owner;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", owner=" + owner +
                ", interest=" + interest +
                '}';
    }
}
