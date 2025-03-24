package Praktikum_ASD.Jobsheet5;

public class MahasiswaBerprestasi21 {
    Mahasiswa21[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi21(int jumlah) {
        listMhs = new Mahasiswa21[jumlah]; 
    }

    void tambah(Mahasiswa21 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa21 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for(int i = 0; i < listMhs.length - 1; i++) {
            int idxmin = i;
            for(int j = i + 1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa21 temp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = temp;
        }

    }
}
