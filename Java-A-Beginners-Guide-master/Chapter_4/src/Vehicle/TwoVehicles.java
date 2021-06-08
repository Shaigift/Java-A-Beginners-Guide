package Vehicle;
// This class declares an object of type Vehicle
public class TwoVehicles {
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

        // compute the ranges assuming a full tank of gas
        range1 = minivan.fuelCap * minivan.kmpl;
        range2 = sportscar.fuelCap * sportscar.kmpl;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with a range of " + range2);
    }
}
