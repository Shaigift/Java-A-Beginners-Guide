package Vehicle;
// A program that uses the Vehicle class.
public class Vehicle {
    int passengers; // number of passengers
    int fuelCap;    // fuel capacity in litres
    int kmpl;        // fuel consumption in kilometres per litres

    // Display the range.
//    void range() {
////        System.out.println("Range is " + fuelCap * kmpl);
//    };
    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        kmpl = m;
    }

    //Return the range.
    int range() {
        return kmpl * fuelCap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int kilometers) {
        return (double) kilometers / kmpl;
    }
}
