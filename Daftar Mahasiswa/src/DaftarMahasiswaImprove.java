import java.io.*;
import java.util.Scanner;

public class DaftarMahasiswaImprove {
    private static String[] nama;
    private static String[] nim;
    private static String[] prodi;
    private static int jumlahData;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data Mahasiswa yang ingin dimasukkan: ");
        jumlahData = sc.nextInt();
        sc.nextLine(); // Menangkap newline setelah nextInt()

        nama = new String[jumlahData];
        nim = new String[jumlahData];
        prodi = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke- " + (i + 1));
            System.out.print("Nama Mahasiswa\t: ");
            nama[i] = sc.nextLine();
            System.out.print("NIM\t: ");
            nim[i] = sc.nextLine();
            System.out.print("Program Studi\t: ");
            prodi[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Simpan Data ke File");
            System.out.println("5. Baca Data dari File");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Menangkap newline

            switch (pilihan) {
                case 1 -> tampilkanData();
                case 2 -> cariMahasiswa(sc);
                case 3 -> hapusMahasiswa(sc);
                case 4 -> simpanDataKeFile();
                case 5 -> bacaDataDariFile();
                case 6 -> {
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tampilkanData() {
        System.out.println("\nData Mahasiswa");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-35s %-30s %s\n", "Nama", "NIM", "Prodi");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-35s %-30s %s\n", nama[i], nim[i], prodi[i]);
        }
    }

    private static void cariMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (nim[i].equals(nimCari)) {
                System.out.printf("Data Ditemukan: %-35s %-30s %s\n", nama[i], nim[i], prodi[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    private static void hapusMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nimHapus = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (nim[i].equals(nimHapus)) {
                ditemukan = true;
                // Menggeser data ke kiri
                for (int j = i; j < jumlahData - 1; j++) {
                    nama[j] = nama[j + 1];
                    nim[j] = nim[j + 1];
                    prodi[j] = prodi[j + 1];
                }
                jumlahData--; // Mengurangi jumlah data
                System.out.println("Data mahasiswa dengan NIM " + nimHapus + " telah dihapus.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    private static void simpanDataKeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data_mahasiswa.txt"))) {
            for (int i = 0; i < jumlahData; i++) {
                writer.write(nama[i] + "," + nim[i] + "," + prodi[i]);
                writer.newLine();
            }
            System.out.println("Data berhasil disimpan ke file 'data_mahasiswa.txt'.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
        }
    }

    private static void bacaDataDariFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data_mahasiswa.txt"))) {
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (index >= jumlahData) {
                    // Jika jumlah data lebih dari yang sudah ada, perluasan array
                    expandDataArrays();
                }
                nama[index] = data[0];
                nim[index] = data[1];
                prodi[index] = data[2];
                index++;
            }
            jumlahData = index; // Update jumlah data
            System.out.println("Data berhasil dibaca dari file 'data_mahasiswa.txt'.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca data: " + e.getMessage());
        }
    }

    private static void expandDataArrays() {
        String[] newNama = new String[jumlahData + 10]; // Menambah kapasitas
        String[] newNim = new String[jumlahData + 10];
        String[] newProdi = new String[jumlahData + 10];

        System.arraycopy(nama, 0, newNama, 0, jumlahData);
        System.arraycopy(nim, 0, newNim, 0, jumlahData);
        System.arraycopy(prodi, 0, newProdi, 0, jumlahData);

        nama = newNama;
        nim = newNim;
        prodi = newProdi;
    }
}