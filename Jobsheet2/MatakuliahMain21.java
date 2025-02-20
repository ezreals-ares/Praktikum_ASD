package Praktikum_ASD.Jobsheet2;

public class MatakuliahMain21 {

    public static void main(String[] args) {
        
        Matakuliah21 mk1 = new Matakuliah21();
        mk1.kodeMK = "qwerty";
        mk1.nama = "UI/UX";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(4);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        Matakuliah21 mk2 = new Matakuliah21("uiop", "OS", 4, 6);

        mk2.tampilInformasi();
        mk2.ubahSKS(6);
        mk2.tambahJam(0);
        mk2.kurangiJam(7);
        mk2.tampilInformasi();
    }
}