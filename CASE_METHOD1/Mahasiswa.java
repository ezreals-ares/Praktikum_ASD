package Praktikum_ASD.CASE_METHOD1;

public class Mahasiswa {

    String NIM;
    String nama;
    String prodi;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }
   
}