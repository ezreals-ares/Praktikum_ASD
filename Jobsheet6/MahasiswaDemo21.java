package Praktikum_ASD.Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo21 {

    public static void main(String[] args) {
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        Scanner sc = new Scanner(System.in);
        int jumlhMhs = 5;

        for (int i = 0; i < jumlhMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nim     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa21(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("------------------------------");
        System.out.println("Pencarian Data Mahasiswa");
        System.out.println("------------------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Binary Search");
        double posisi = list.findBinarySearch(cari, 0, jumlhMhs - 1);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

    

        sc.close();
    }
}