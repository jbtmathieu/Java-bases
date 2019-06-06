public class LDD extends BankAccount {
    //members
protected float interestRate=1.0f;
    //constr

    public LDD(Owner owner) {
        super(owner);
        amount= 15.0f;
        overdraft = -15.0f;
        ceiling = 12000f;
    }
    //set get

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }


    public final void interestPayment(){

        this.amount = amount*interestRate/100 +amount;
    }

}


