package Praktikum_ASD.BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainPangkat21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        pangkat21[] png = new pangkat21[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai base elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat21(basis, pangkat);
            
        }

        System.out.println("HASIL PANGKAT DENGAN BRUTE FORCE");
        for (pangkat21 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DENGAN DIVIDE CONQUER");
        for (pangkat21 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

        sc.close();

    }
}
