package Praktikum_ASD.Jobsheet6;

public class MahasiswaBerprestasi21 {

    Mahasiswa21[] listMhs = new Mahasiswa21[5];
    int idx;

    void tambah(Mahasiswa21 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        System.out.println("Daftar Mahasiswa Berprestasi:");
        for (Mahasiswa21 mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println();
        }
    }

    // int sequentialSearching(double cari) {
    //     int posisi = -1;
    //     for (int j = 0; j < listMhs.length; j++) {
    //         if (listMhs[j].ipk == cari) {
    //             posisi = j;
    //             break;
    //         }
            
    //     }
    //     return posisi;
    // }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data Mahasisawa dengan IPK " + x + " ditemukan pada index ke-" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
          
        } 
    }
}