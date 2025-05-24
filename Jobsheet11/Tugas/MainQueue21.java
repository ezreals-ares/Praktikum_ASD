package Praktikum_ASD.Jobsheet11.Tugas;

import java.util.Scanner;

public class MainQueue21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian21 antrian = new QueueAntrian21();
        int pilih;

        do {
            System.out.println("\n===== MENU ANTRIAN UNIT KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peekFront();
                    break;

                case 4:
                    antrian.peekrear();
                    break;

                case 5:
                    antrian.print();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getSize());
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih. Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
        sc.close();
    }
}
