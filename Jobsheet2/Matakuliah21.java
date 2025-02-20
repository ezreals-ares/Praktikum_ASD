package Praktikum_ASD.Jobsheet2;

public class Matakuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Matakuliah21 () {

    }

    public Matakuliah21 (String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }



    void tampilInformasi () {
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int tambah_jam) {
        jumlahJam += tambah_jam;
    }

    void kurangiJam(int kurangi_jam) {
        if (jumlahJam - kurangi_jam < 0) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= kurangi_jam;
        }
    }

}