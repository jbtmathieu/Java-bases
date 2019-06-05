public class LEP extends LDD{
    //members

    //constr

    public LEP(Person person) {
        //if (owner.getType().equals(Person)) {
            super(person.getType());
            super.setAmount(30.0f);
            super.setOverdraft(-30f);
            super.setCeiling(7700);
            super.setInterestRate(1.5f);

    }

}
