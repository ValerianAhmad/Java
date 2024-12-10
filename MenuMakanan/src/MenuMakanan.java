import java.util.ArrayList;
import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pesanan = new ArrayList<>();
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu pesanan anda: ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 10) { 
                pesanan.add(pilihan);
                System.out.println("Pesanan ditambahkan.");    
            } else if (pilihan == 0) {
                System.out.println("Rp.500 adalah untuk biaya admin");
                System.out.println("Terimakasih atas pesanan anda!");
            } else {
                System.out.println("Pilihan tidak tersedia.");
            } 
        } while (pilihan != 0);

            int totalHarga = hitungTotal(pesanan);
            System.out.println("Total harga pesanan anda: RP. " + totalHarga);
    }

    private static void tampilkanMenu() {
        System.out.println("Menu Makanan: ");
        System.out.println("0. Keluar");
        System.out.println("1. Nasi             - Rp. 6.000");
        System.out.println("2. Ayam             - Rp. 4.000");
        System.out.println("3. Telur            - Rp. 5.000");
        System.out.println("4. Es Teh           - Rp. 3.000");
        System.out.println("5. Kopi             - Rp. 3.000");
        System.out.println("6. Chocolatos       - Rp. 6.000");
        System.out.println("7. Kopi ABC         - Rp. 4.000");
        System.out.println("8. Red Velvet       - Rp. 6.000");
        System.out.println("9. Rokok Surya      - Rp. 26.000");
        System.out.println("10. Rokok Sampoerna - Rp. 34.000");
    }

    private static int hitungTotal(ArrayList<Integer> pesanan) {
        int harga = 500;
        for (int item : pesanan) {
            if (item == 1) {
                harga += 6000;
            } else if (item == 2) {
            	harga += 4000;
            } else if (item == 3) {
            	harga += 5000;
            } else if (item == 4) {
            	harga += 3000;
            } else if (item == 5) {
            	harga += 3000;
            } else if (item == 6) {
            	harga += 6000;
            } else if (item == 7) {
            	harga += 4000;
            } else if (item == 8) {
            	harga += 6000;
            } else if (item == 9) { 
            	harga += 26000;
            } else if (item == 10) {
            	harga += 34000;
            }
        }
        return harga;
    }
}
