package Praktikum_ASD.Jobsheet3.Praktikum03;

public class Mahasiswa21 { 

    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    String cekinfo() {
        return "NIM     : " + nim + "\n" +
               "Nama    : " + nama + "\n" +
               "Kelas   : " + kelas + "\n" +
               "IPK     : " + ipk;
    }

}