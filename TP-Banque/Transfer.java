import Account.Account;

public final class Transfer {

    private Account credit;
    private Account debit;
    private float amount;

    public Transfer(Account credit, Account debit, float amount) {
        this.credit = credit;
        this.debit = debit;
        this.amount = amount;
    }

    public void applyTransfert() throws Exception {
        this.debit.virement(this.credit, this.amount);
    }
}
