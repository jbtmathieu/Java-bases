public class main {
    public static void main(String[] args) {
        boolean cond;
        float aFloat;
        String model="206";
        String year="1999";
        float price=1000.52f;
        String registration="CD-123-EF";
        char permis = 'B';

        Vehicle aVehicle = new Vehicle(model, year, price, registration, permis);
        aVehicle.viewF();
        aVehicle.view();

        Car aCar = new Car("207","2002",2535.42f,"XY-456-GH",'B',  true);
        aCar.view();

        //Car aCarV= new Car(aVehicle, true);

        BigVehicle aBigVehicle= new BigVehicle(aVehicle,120.2f);

        Truck aTruck= new Truck(aBigVehicle);
        aTruck.view();

        Bus aBus = new Bus(aBigVehicle, 52);
        aBus.view();

        cond = aTruck.canCarry(200f);
        System.out.println(cond);
        cond = aTruck.canCarry(100f);
        System.out.println(cond);

        // codage 6.
        aFloat = aCar.RentingCost("2003");
        System.out.println("Coût journalier d'une "+aCar.getModel()+" : "+aFloat);
        aFloat = aCar.RentingCost("2004");
        System.out.println("Coût journalier d'une "+aCar.getModel()+" : "+aFloat);


        // codage 7.
        cond = aBus.canCarry(120.2f,52); //= =
        System.out.println(cond);
        cond = aBus.canCarry(120.3f,50);//+ -
        System.out.println(cond);
        cond = aBus.canCarry(120.1f,52);// - =
        System.out.println(cond);
        cond = aBus.canCarry(120.3f,53); //+ +
        System.out.println(cond);

        //pp 1.
        Car twingo= new Car("Twingo", "2019",10000, "1234 AZ 49", 'B', true);
        twingo.view();
        //pp 2.
        Truck J9= new Truck("J9",Integer.toString(2019-5),20000, "987 BCD 75", 'B', 25.0f);
        J9.view();
        cond=J9.canCarry(7.0f);
        System.out.println("Can carry 7m²? "+cond);

        //pp 3.
        aFloat = twingo.RentingCost("2003");
        System.out.println("Coût journalier d'une "+twingo.getModel()+" : "+aFloat);
        aFloat = J9.RentingCost("2004");
        System.out.println("Coût journalier d'une "+J9.getModel()+" : "+aFloat);

        //pp 4.
        Bus FRI = new Bus("FRI", "2005", 90000, "4567WX01", 'D', 3, 53);
        FRI.view();
        cond=FRI.canCarry((float) (0.1*40),40);
        System.out.println("Can carry 40 passengers with 4m² of luggages? "+cond);


    }
}
