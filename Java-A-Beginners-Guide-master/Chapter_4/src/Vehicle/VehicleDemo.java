package Vehicle;
// This class declares an object of type Vehicle.
public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.kmpl = 21;

        // compute the range assuming a full tank of gas
        range = minivan.fuelCap * minivan.kmpl;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range);
    }
}
