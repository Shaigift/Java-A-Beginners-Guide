package Vehicle;

public class VehConsDemo {
    public static void main(String args[]) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double litres;
        int dist = 252;

        litres = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " kilometres minivan needs " +
                litres + " litres of fuel.");

        litres = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " kilometres sportscar needs " +
                litres + " litres of fuel.");

    }
}
