package Account;

import Owner.Person;

public final class LepAccount extends ThriftAccount {

    public LepAccount(Person person, float balance) throws Exception {
        super(person, balance);

        this.interest = 1.5f;
        this.min = 30;
        this.max = 7700;
    }
}
