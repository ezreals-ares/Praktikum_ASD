package Praktikum_ASD.Jobsheet10.P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Prodi: ");
                        String prodi = sc.nextLine();
                        System.out.print("Masukkan Kelas: ");
                        String kelas = sc.nextLine();
                        Mahasiswa21 mhs = new Mahasiswa21(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(mhs);
                    } else {
                        System.out.println("Antrian sudah penuh!");
                    }
                    break;
                case 2:
                    Mahasiswa21 dilayani = antrian.LayaniMahasiswa();
                    if(dilayani != null) {
                        System.out.println("Melayani mahasiswa:");
                        dilayani.tampilData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 0);
        sc.close();
    }
}