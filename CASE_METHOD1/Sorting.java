package Praktikum_ASD.CASE_METHOD1;

public class Sorting {

    static void SelectionSortPen(Penilaian[] daftarPenilaian) {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < daftarPenilaian.length; j++) {
                if(daftarPenilaian[j].nilaiAkhir > daftarPenilaian[max].nilaiAkhir) {
                    max = j;
                }
            }

            if (i != max) {
                Penilaian temp = daftarPenilaian[i];
                daftarPenilaian[i] = daftarPenilaian[max];
                daftarPenilaian[max] = temp;  
            } 
        }
    }


}