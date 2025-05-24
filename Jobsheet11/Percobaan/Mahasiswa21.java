package Praktikum_ASD.Jobsheet11.Percobaan;

public class Mahasiswa21 {

    String nim, nama, kelas;
    double ipk;

    Mahasiswa21(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

     void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
      
    }
}
