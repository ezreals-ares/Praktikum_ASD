package Praktikum_ASD.Jobsheet1;
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double[] nilaiAngka = new double[namaMK.length];
        double[] bobotNilai = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        
        double totalBobotNilai = 0;
        
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                bobotNilai[i] = 4.0;
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                bobotNilai[i] = 3.5;
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                bobotNilai[i] = 3.0;
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                bobotNilai[i] = 2.5;
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                bobotNilai[i] = 2.0;
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                bobotNilai[i] = 1.0;
                nilaiHuruf[i] = "D";
            } else {
                bobotNilai[i] = 0.0;
                nilaiHuruf[i] = "E";
            }
            
            totalBobotNilai += bobotNilai[i];
        }
        
        double ipSemester = totalBobotNilai / namaMK.length;
        
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("====================================================");
        System.out.printf("%-40s %-12s %-12s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-10.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("====================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        
        scanner.close();
    }
}
