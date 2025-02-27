package Praktikum_ASD.Jobsheet3.Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah21[] arrayOfMatakuliah = new Matakuliah21[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode    : ");
            kode = sc.nextLine();
            System.out.println("Nama    : ");
            nama = sc.nextLine();
            System.out.println("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("====================================");

            arrayOfMatakuliah[i] = new Matakuliah21(kode, nama, sks, jumlahJam);
        }

        sc.close();
    }
}