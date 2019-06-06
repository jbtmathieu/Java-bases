import java.util.Random;

public abstract class BankAccount {
    //members
    protected Owner owner;

    protected int bankAccountNumber;

    protected float amount=0;

    protected float overdraft=0;
    protected float ceiling=100000f;

    protected static float transferCommission = 1.0f;
    //constr

    public BankAccount(Owner owner) {
        this.owner = owner;
        Random random= new Random();
        bankAccountNumber = Math.abs(random.nextInt());

    }


    //set get

    public Owner getOwner() {

        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public  int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
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

    //other


    @Override

    public String toString() {
        return "BankAccount "+bankAccountNumber+"{" +
                "owner=" + owner +
                ", amount=" + amount +
                ", overdraft=" + overdraft +
                ", ceiling=" + ceiling +
                '}';
    }
}
