import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data Mahasiswa yang ingin dimasukkan: ");
        int jumlahData = sc.nextInt();
        
        String [] nama = new String[jumlahData];
        String [] nim = new String[jumlahData];
        String [] prodi = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke- " + (i + 1));
            System.out.print("Nama Mahasiswa\t: ");
            nama[i] = sc.next();
            System.out.print("NIM\t: ");
            nim[i] = sc.next();
            System.out.print("Program Studi\t: ");
            prodi[i] = sc.next();
        }

        System.out.println("Data Mahasiswa");
        System.out.println("-----------------------------------");
        System.out.printf(  "%-20 %-15s %s\n", "Nama, NIM, Program Studi\n");
        System.out.println("-----------------------------------");
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-20s %15s %s\n", nama[i], nim[i], prodi[i]);
        }
        sc.close();
    }
}
