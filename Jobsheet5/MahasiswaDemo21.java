package Praktikum_ASD.Jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); 

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumlahMahasiswa);

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

       
        System.out.println("\nData Mahasiswa Sebelum Sorting:");
        list.tampil();

        // list.bubbleSort();
        // System.out.println("\nData Mahasiswa Setelah Sorting (Descending Berdasarkan IPK):");
        // list.tampil();

        list.selectionSort();
        System.out.println("\nData Mahasiswa Setelah Sorting (Ascending Berdasarkan IPK):");
        list.tampil();

        input.close();
    }
}
