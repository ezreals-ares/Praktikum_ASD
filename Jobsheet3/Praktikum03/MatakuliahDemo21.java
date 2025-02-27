package Praktikum_ASD.Jobsheet3.Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah : ");
        int jumlahMatakuliah = sc.nextInt();

        Matakuliah21[] arrayOfMatakuliah = new Matakuliah21[jumlahMatakuliah];
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah21("", "", 0, 0);
            arrayOfMatakuliah[i].tambahdata();
        }

        System.out.println("Data Matakuliah yang telah dimasukkan : ");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }

       

        sc.close();
    }
}