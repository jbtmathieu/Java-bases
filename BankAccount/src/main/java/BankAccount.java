import java.util.Random;

public class BankAccount {
    //members
    protected EnumOwner owner;
    protected static int bankAccountNumber;
    protected float amount=0;
    protected float overdraft=0;
    protected float ceiling=100000f;

    protected static float transferCommission = 1.0f;
    //constr

    public BankAccount(EnumOwner owner) {
        this.owner = owner;
        Random random= new Random();
        bankAccountNumber = (random.nextInt());

    }


    //set get

    public EnumOwner getOwner() {
        return owner;
    }

    public void setOwner(EnumOwner owner) {
        this.owner = owner;
    }

    public static int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public static void setBankAccountNumber(int bankAccountNumber) {
        BankAccount.bankAccountNumber = bankAccountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount=amount;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public float getCeiling() {
        return ceiling;
    }

    public void setCeiling(float ceiling) {
        this.ceiling = ceiling;
    }

    public static float getTransferCommission() {
        return transferCommission;
    }

    public static void setTransferCommission(float transferCommission) {
        BankAccount.transferCommission = transferCommission;
    }

    //other
    public boolean withdrawal(float amount){
        if (amount <= (this.amount+overdraft)){
            this.amount = this.amount- amount;
            return true;
        }
        return false;
    }

    public boolean deposit(float amount){
        if (amount <= (this.amount+overdraft)){
            this.amount = this.amount+ amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(BankAccount bankAccount,float amount){
        if (amount <= (this.amount+overdraft)){
            this.amount = (this.getOwner() == bankAccount.getOwner())? this.amount - amount: this.amount - amount - transferCommission;
            return true;
        }
        return false;

        //
    }


}
