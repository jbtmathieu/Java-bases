package Account;

import Owner.Owner;

public abstract class ThriftAccount extends Account {

    protected float min;
    protected float max;

    public ThriftAccount(Owner owner, float balance) throws Exception {
        super(owner, balance);
    }

    @Override
    protected void verser(float amount) throws Exception {
        if (this.balance + amount > this.max) {
            throw new Exception("Erreur, le solde de votre compte a atteint le plafond de " + this.max + " euro(s) !");
        }

        this.balance += amount;
    }

    @Override
    protected void retirer(float amount) throws Exception {

        if (this.balance - amount < this.min) {
            throw new Exception("Erreur, le solde de votre compte est insuffisant !");
        }

        this.balance -= amount;
    }
}
