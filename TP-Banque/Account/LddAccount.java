package Account;
import Owner.Owner;

public final class LddAccount extends ThriftAccount {

    public LddAccount(Owner owner, float balance) throws Exception {
        super(owner, balance);

        this.interest = 1;
        this.min = 15;
        this.max = 12000;
    }
}
