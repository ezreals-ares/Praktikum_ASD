package Praktikum_ASD.BruteForceDivideConquer.minggu5;
import java.util.Scanner;

public class MainFaktorial21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        faktorial21 fk = new faktorial21();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

        sc.close();
    }
}