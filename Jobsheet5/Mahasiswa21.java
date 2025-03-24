package Praktikum_ASD.Jobsheet5;

public class Mahasiswa21 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa21() {
    }

    Mahasiswa21 (String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;

    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}