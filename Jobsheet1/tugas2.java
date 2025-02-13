package Praktikum_ASD.Jobsheet1;
import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    
    public static int tampilkanMenu() {
        
        System.out.println("=== KALKULATOR KUBUS ===");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();
        return pilihan;
    }

 
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

 
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

  
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            pilihan = tampilkanMenu();
            
            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = sc.nextDouble();
                
                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                        break;
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            }

            System.out.println(); 
        } while (pilihan != 4);

        sc.close();
    }
}
