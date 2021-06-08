package Vehicle;

public class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double litres;
        int dist = 252;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.kmpl = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelCap = 14;
        sportscar.kmpl = 12;

        litres = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " kilometres minivan needs " +
                litres + " litres of fuel.");

        litres = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " kilometres sportscar needs " +
                litres + " litres of fuel.");

    }
}
