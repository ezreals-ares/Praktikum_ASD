package Praktikum_ASD.Jobsheet2;

public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen21 (){

    }

    public Dosen21 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        if (statusAktif) {
            System.out.println("Dosen Status Aktif");
        } else {
            System.out.println("Dosen Status Nonaktif");
        }

    }

    void setStatusAktif(boolean statusAktifDosen) {
        statusAktif = statusAktifDosen;
    }
    
    int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String keahlianSekarang) {
        bidangKeahlian = keahlianSekarang;
    }
}