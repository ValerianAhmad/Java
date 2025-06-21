import java.util.Scanner;

public class LogikaOperator {

    // Method untuk menghitung implikasi
    public static boolean implikasi(boolean a, boolean b) {
        return !a || b;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan dua nilai boolean (true/false): ");

        // Input nilai boolean
        System.out.println("Masukkan nilai a (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.println("Masukkan nilai b (true/false): ");
        boolean b = sc.nextBoolean();

        // Operasi logika
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean noAtResult = !a;
        boolean notBResult = !b;
        boolean implikasiResult = implikasi(a, b);

        // Menampilkan hasil dari operasi logika
        System.out.println("\nHasil dari operasi logika: ");
        System.out.println("a AND b: " + andResult);
        System.out.println("a OR b: " + orResult);
        System.out.println("NOT a: " + noAtResult);
        System.out.println("NOT b: " + notBResult);
        System.out.println("a IMPLIKASI b: " + implikasiResult);

        sc.close();
    }
}
