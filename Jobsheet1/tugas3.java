package Praktikum_ASD.Jobsheet1;
import java.util.Scanner;

public class tugas3 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static String[] namaMatkul;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;

   

    public static void inputData() {
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();

            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");

            semester[i] = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
    }

    public static void menu() {
        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                    
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hariCari = scanner.nextLine();
                    tampilkanJadwalHari(hariCari);
                    break;

                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterCari = scanner.nextInt();
                    tampilkanJadwalSemester(semesterCari);
                    break;

                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    cariMataKuliah(namaCari);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-5.");
            }
        } while (pilihan != 5);
    }

  
    public static void tampilkanSeluruhJadwal() {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
        }
    }

    
    public static void tampilkanJadwalHari(String hariCari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah di hari " + hariCari);
        }
    }

   
    public static void tampilkanJadwalSemester(int semesterCari) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + semesterCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Hari " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah di semester " + semesterCari);
        }
    }

    public static void cariMataKuliah(String namaCari) {
        System.out.println("\n=== HASIL PENCARIAN MATA KULIAH ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (namaMatkul[i].equalsIgnoreCase(namaCari)) {
                System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - Hari " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah '" + namaCari + "' tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = scanner.nextInt();
        scanner.nextLine(); 

        namaMatkul = new String[n];
        sks = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];

        inputData();
        menu();
    }
}
