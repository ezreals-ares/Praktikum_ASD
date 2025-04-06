package Praktikum_ASD.Jobsheet5;

public class DataDosen21 {
    Dosen21[] dataDosen = new Dosen21[10];
    int idx = 0;

    public void tambah(Dosen21 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen kosong!");
        } else {
            System.out.println("Daftar Dosen:");
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    public void SortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen21 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASCENDING (Termuda ke Tertua).");
    }

    public void SortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen21 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DESCENDING (Tertua ke Termuda).");
    }
}
