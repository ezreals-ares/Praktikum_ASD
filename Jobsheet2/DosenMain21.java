package Praktikum_ASD.Jobsheet2;

public class DosenMain21 {

    public static void main(String[] args) {
        
        Dosen21 dosen1 = new Dosen21();
        dosen1.idDosen = "1234";
        dosen1.nama = "Budi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Komputasi";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Design");
        dosen1.tampilInformasi();
        

        Dosen21 dosen2 = new Dosen21("567", "Yanto", true, 2011, "Sains");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Komputasi");
        dosen2.tampilInformasi();
    }


}