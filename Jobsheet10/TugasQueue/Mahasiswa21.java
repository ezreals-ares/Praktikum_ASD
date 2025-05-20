package Praktikum_ASD.Jobsheet10.TugasQueue;

public class Mahasiswa21 {

    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa21(String nim, String nama, String prodi, String kelas ) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}