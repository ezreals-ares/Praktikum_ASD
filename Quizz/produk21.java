package Praktikum_ASD.Quizz;

public class produk21 {

    String nama21;
    double harga21;
    int stok21;
    double diskon21;

    produk21(String nama21, double harga21, int stok21, double diskon21) {
        this.nama21 = nama21;
        this.harga21 = harga21;
        this.stok21= stok21;
        this.diskon21 = diskon21;
    }

    void tampilkanInformasi() {
        System.out.println("Nama barang: " + this.nama21);
        System.out.println("Harga barang: " + this.harga21);
        System.out.println("Stok barang: " + this.stok21);
        System.out.println("Diskon barang: " + this.diskon21);
        System.out.println("=================================");
    }

    double Hitungdiskon () {
        double harga_diskon21 = harga21 - ((harga21 * diskon21) /100);
        return harga_diskon21;
    }


    
}
