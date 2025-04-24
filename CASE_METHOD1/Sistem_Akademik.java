package Praktikum_ASD.CASE_METHOD1;
import java.util.Scanner;
public class Sistem_Akademik {

    public static void main(String[] args) {
        
        Mahasiswa[] daftarMHS = new Mahasiswa[3];
        daftarMHS[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        daftarMHS[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        daftarMHS[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        MataKuliah[] daftarMK = new MataKuliah[3];
        daftarMK[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMK[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMK[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] daftarPenilaian = new Penilaian[5];
        daftarPenilaian[0] = new Penilaian(daftarMHS[0], daftarMK[0], 80, 85, 90);
        daftarPenilaian[1] = new Penilaian(daftarMHS[0], daftarMK[1], 60, 75, 70);
        daftarPenilaian[2] = new Penilaian(daftarMHS[1], daftarMK[0], 75, 70, 80);
        daftarPenilaian[3] = new Penilaian(daftarMHS[2], daftarMK[1], 85, 90, 95);
        daftarPenilaian[4] = new Penilaian(daftarMHS[2], daftarMK[2], 80, 90, 65);

        Penilaian[] daftarPenSorted = new Penilaian[5];
        daftarPenSorted[0] = new Penilaian(daftarMHS[0], daftarMK[0], 80, 85, 90);
        daftarPenSorted[1] = new Penilaian(daftarMHS[0], daftarMK[1], 60, 75, 70);
        daftarPenSorted[2] = new Penilaian(daftarMHS[1], daftarMK[0], 75, 70, 80);
        daftarPenSorted[3] = new Penilaian(daftarMHS[2], daftarMK[1], 85, 90, 95);
        daftarPenSorted[4] = new Penilaian(daftarMHS[2], daftarMK[2], 80, 90, 65);

        Scanner sc = new Scanner(System.in);
        int pilihMenu;

        do {
            System.out.println();
            System.out.println("==== MENU SISTEM AKADEMIK ====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihMenu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(pilihMenu) {

                case 1:
                    System.out.println("[DAFTAR MAHASISWA]");
                    for(Mahasiswa mhs : daftarMHS) {
                        mhs.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("[DAFTAR MATA KULIAH]");
                    for(MataKuliah mk : daftarMK) {
                        mk.tampilMataKuliah();
                    }
                    break;

                case 3:
                    System.out.println("[DAFTAR PENILAIAN]");
                    for(Penilaian p : daftarPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;

                case 4:
                    Sorting.SelectionSortPen(daftarPenSorted);
                    System.out.println("[URUTAN MAHASISWA BERDASARKAN NILAI AKHIR]");
                    for(Penilaian p : daftarPenSorted) {
                        p.tampilPenilaian();
                    }
                    break;
                
                case 5:
                    System.out.println("[PENCARIAN MAHASISWA BERDASARKAN NIM]");
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.nextLine();
                    System.out.println();
                    int pos = Searching.SequentialSearchMHS(daftarMHS, nimCari);
                    Searching.tampilSearchMHS(pos, daftarMHS);
                    break;

                case 0:
                    System.out.println("Keluar dari Sistem Akademik");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
               
            }

        } while (pilihMenu != 0);

        sc.close();
    }
}