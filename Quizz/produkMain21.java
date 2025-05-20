package Praktikum_ASD.Quizz;

import java.util.Scanner;

public class produkMain21 {
    
    public static void main(String[] args) {
        
        Scanner sc21 = new Scanner(System.in);
        produk21[] produk21 = new produk21[4];

        String name_21;
        double harga_21;
        int stok_21;
        double diskon_21;

        for (int i = 0; i < produk21.length; i++) {
            
            System.out.print("Masukkan Nama Barang ke-" + (i+1) + ": ");
            name_21 = sc21.nextLine();
            System.out.print("Masukkan Harga Barang ke-" + (i+1) + ": ");
            harga_21 = sc21.nextDouble();
            System.out.print("Masukkan Stok Barang ke-" + (i+1) + ": ");
            stok_21 = sc21.nextInt();
            System.out.print("Masukkan Diskon Barang ke-" + (i+1) + ": ");
            diskon_21 = sc21.nextDouble();
            produk21[i] = new produk21(name_21, harga_21, stok_21, diskon_21);
            sc21.nextLine();
        }

        System.out.println();

        for (int i = 0; i < produk21.length; i++) {
            produk21[i].tampilkanInformasi();
        }

        for (int i = 0; i < produk21.length; i++) {
            double tampikDiskon21 = produk21[i].Hitungdiskon();

            System.out.println("Harga Diskon barang ke-" + (i+1) + tampikDiskon21);
            
        }

        sc21.close();



    }
}
