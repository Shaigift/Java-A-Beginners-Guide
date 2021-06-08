package Vehicle;

public class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.kmpl = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.kmpl = 12;


        System.out.print("Minivan can carry " + minivan.passengers +
                ". ");

        minivan.range(); // display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers +
                ". ");

        sportscar.range(); // display range of sportscar.
    }
}
