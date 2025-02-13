package Praktikum_ASD.Jobsheet1;
import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        
       
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
        
        System.out.println("=================================");
        
        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("\nNilai tidak valid");
            System.out.println("=================================");
        } else {
            
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String nilaiHuruf;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
           
            boolean lulus = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C");
            
            
            System.out.printf("\nNilai Akhir: %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=================================");
            if (lulus) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
        
        scanner.close();
    }
    
}
