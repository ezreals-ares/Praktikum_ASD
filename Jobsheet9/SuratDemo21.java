package Praktikum_ASD.Jobsheet9;

import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat21 stackSurat = new StackSurat21(10);

        int pilihan;
        do {
            System.out.println("\nMenu Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat21 suratBaru = new Surat21(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2:
                    Surat21 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.printf("Memproses surat dari %s (%s) - %c selama %d hari\n",
                            diproses.namaMahasiswa, diproses.kelas, diproses.jenisIzin, diproses.durasi);
                    }
                    break;

                case 3:
                    Surat21 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.printf("Surat terakhir dari %s (%s) - %c selama %d hari\n",
                            terakhir.namaMahasiswa, terakhir.kelas, terakhir.jenisIzin, terakhir.durasi);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    boolean ditemukan = stackSurat.cariSurat(namaCari);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan.");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Daftar Semua Surat Izin:");
                    stackSurat.printAll();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem surat izin.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
