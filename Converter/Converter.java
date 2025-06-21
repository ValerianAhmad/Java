import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many gallons do you wish to convert?");
        double gallons = sc.nextDouble();
        double liters = gallons*3.785;
        System.out.println(gallons + " gallons is equivalent to " + liters + " liters.");
        sc.close();
    }
}

// MENGHITUNG LITER DALAM 1 GALON