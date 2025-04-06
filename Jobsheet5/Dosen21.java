package Praktikum_ASD.Jobsheet5;

public class Dosen21 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    public Dosen21(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia);
        System.out.println("-------------------------------");
    }
}
