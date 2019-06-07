package Account;

import Owner.Owner;

public final class MainAccount extends Account {

    private float decouvert;

    public MainAccount(Owner owner, float solde) throws Exception {
        this(owner, solde, 0);
    }

    public MainAccount(Owner owner, float solde, float decouvert) throws Exception {
        super(owner, solde);

        this.decouvert = Math.abs(decouvert);
        this.interest = 0;
    }

    @Override
    public void verser(float amount) throws Exception {
        this.balance += amount;
    }

    @Override
    public void retirer(float amount) throws Exception {
        if (this.balance - amount < - this.decouvert) {
            throw new Exception("Erreur, le solde de votre compte est insuffisant !");
        }

        this.balance -= amount;
    }
}
