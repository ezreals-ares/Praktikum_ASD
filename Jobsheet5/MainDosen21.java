package Praktikum_ASD.Jobsheet5;

import java.util.Scanner;

public class MainDosen21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen21 daftarDosen = new DataDosen21();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (daftarDosen.idx < 10) {
                        System.out.print("Masukkan Kode Dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan Nama Dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                        char jk = sc.next().charAt(0);
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Masukkan Usia Dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen21 dsn = new Dosen21(kode, nama, jenisKelamin, usia);
                        daftarDosen.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan!");
                    } else {
                        System.out.println("Data sudah penuh!");
                    }
                    break;

                case 2:
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.SortingASC();
                    daftarDosen.tampil();
                    break;

                case 4:
                    daftarDosen.SortingDSC();
                    daftarDosen.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
