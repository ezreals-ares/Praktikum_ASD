package Praktikum_ASD.Jobsheet5;

public class SortingMain21 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[]= {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};
        Sorting21 dataUrut1 = new Sorting21(a, a.length);
        Sorting21 dataUrut2 = new Sorting21(b, b.length);
        Sorting21 dataUrut3 = new Sorting21(c, c.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bublesort();
        System.out.println("Data sudah diurutkan dengan BUBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionsort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}