import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun lahir: ");
        int year = scanner.nextInt();
        System.out.print("Masukkan Bulan lahir: ");
        int month = scanner.nextInt();
        System.out.print("Masukkan Tanggal lahir: ");
        int day = scanner.nextInt();

        LocalDate birthDate = java.time.LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        System.out.print("Umur anda adalah: " + age.getYears() + " Tahun, " + age.getMonths() + " Bulan, " + age.getDays() + " Hari.");
 
        scanner.close();
    }
}