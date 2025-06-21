public class Vehicle implements Comparable <Vehicle> {
    private String make;
    private int milesPerGallon;

    public Vehicle() {
        make = "";
        milesPerGallon = 0;
    }
        
    public Vehicle(String make, int milesPerGallon) {
        this.make = make;
        this.milesPerGallon = milesPerGallon;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public String getMake() {
        return make;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.milesPerGallon, other.milesPerGallon);
    }

    @Override
    public String toString() {
        return "Vehicle Make: " +  make + ", Miles Per Gallon: " + milesPerGallon;
    }
}