package Praktikum_ASD.Jobsheet2;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi();
        mhs1.ubahkelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilInformasi();
    }
}
