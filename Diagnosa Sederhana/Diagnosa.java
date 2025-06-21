import java.util.Scanner;

public class Diagnosa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Sistem Deteksi Penyakit Sederhana ===");
        System.out.println("Jawab pertanyaan berikut dengan 'y' (ya) atau 'n' (tidak): ");
        
        System.out.println("Apakah anda mengalami demam?");
        char demam = sc.next().charAt(0);
        
        System.out.println("Apakah anda mengalami batuk?");
        char batuk = sc.next().charAt(0);
        
        System.out.println("Apakah anda merasa sesak nafas?");
        char sesakNafas = sc.next().charAt(0);
        
        System.out.println("Apakah anda merasa nyeri di tenggorokan?");
        char nyeriTenggorokan = sc.next().charAt(0);
        
        System.out.println("Apakah anda merasa lemas atau kelelahan?");
        char lemas = sc.next().charAt(0);

        System.out.println("\n=== Hasil Diagnosa ===");
        if (demam == 'y' && batuk == 'y' && sesakNafas == 'y') {
            System.out.println("Kemungkinan anda mengalami  gejala COVID-19. Segera konsultasikan dengan dokter!");
        } else if (demam == 'y' && nyeriTenggorokan == 'y' && lemas == 'y') {
            System.out.println("Kemungkinan anda mengalami gejala flu. Istirahat yang cukup dan banyak minum air.");
        } else if (nyeriTenggorokan == 'y' && batuk == 'y') {
            System.out.println("Kemungkinan anda mengalami radang tenggorokan. Hindari makanan berminyak :)");
        } else if (lemas == 'y' && demam == 'y') {
            System.out.println("Kemungkinan anda mengalami kelelahan atau dehidrasi. Minum air yang cukup dan periksa suhu tubuh.");
        } else {
            System.out.println("Gejala anda tidak sesuai dengan pola penyakit yang terdeteksi. Sebaiknya konsultasikan dengan dokter.");
        }

        System.out.println("\nTerimakasih telah menggunakan sistem deteksi penyakit sederhana ini!");
        sc.close();
    }
}
