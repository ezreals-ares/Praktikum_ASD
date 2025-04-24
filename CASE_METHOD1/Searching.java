package Praktikum_ASD.CASE_METHOD1;

public class Searching {

    static int SequentialSearchMHS(Mahasiswa[] daftarMHS, String nim) {
        int pos = -1;
        for (int i = 0; i < daftarMHS.length; i++) {
             if (daftarMHS[i].NIM.equals(nim)) {
                 pos = i;
                 break;
             }
         
        }
        return pos;
     }
 
     static void tampilSearchMHS(int pos, Mahasiswa[] daftarMHS) {
         if (pos != -1) {
             Mahasiswa mhs = daftarMHS[pos];
             System.out.println("Data Mahasiswa Dengan NIM " + mhs.NIM + " Ditemukan: ");
             System.out.println("NIM: " + mhs.NIM + " | Nama: " + mhs.nama + " | Prodi: " + mhs.prodi);
         } else {
             System.out.println("Data Mahasiswa Tidak ditemukan");
         }
     }
}