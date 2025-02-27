package Praktikum_ASD.Jobsheet3.Praktikum03;

import java.util.Scanner;

public class DosenDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen21[] dosen = new Dosen21[3];
        String kode;
        String nama;
        String jenisKelamin;
        int usia;

        for (int i = 0; i < dosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin: ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia: ");
            usia = sc.nextInt();
            sc.nextLine();
            dosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
            System.out.println("===================================");
        }

        System.out.println("Data Dosen");

        for(Dosen21 d : dosen) {
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + d.jenisKelamin);
            System.out.println("Usia: " + d.usia);
            System.out.println("===================================");
        }
        
        DataDosen21 dataDosen = new DataDosen21();
        dataDosen.dataSemuaDosen(dosen); 
        dataDosen.jumlahDataPerjenisKelamin(dosen);
        dataDosen.rerataUsia(dosen);
        dataDosen.infoDosenPalingTua(dosen);
        dataDosen.infoDosenPalingMuda(dosen);

        sc.close();
        
    }

    
}