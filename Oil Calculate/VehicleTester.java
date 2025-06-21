import java.util.ArrayList;
import java.util.Collections;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Innova Reborn", 30);
        Vehicle v2 = new Vehicle("Fortuner", 20);
        Vehicle v3 = new Vehicle("Honda Accord", 35);

        System.out.println("==============================================================");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println("==============================================================");

        System.out.println("Comparing " + v1.getMake() + " and " + v2.getMake() + ": " + v1.compareTo(v2));

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        Collections.sort(vehicles);
        System.out.println("Vehicles sorted by miles per gallon: ");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}