package Praktikum_ASD.Jobsheet1;
public class fungsi {
    public static void main(String[] args) {
       
        int[][] stokBunga = {
            {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}    
        };

        
        int[] hargaBunga = {75000, 50000, 60000, 10000};

       
        hitungPendapatan(stokBunga, hargaBunga);

        
        cekStokCabang4(stokBunga[3]);
    }

    public static void hitungPendapatan(int[][] stok, int[] harga) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j]; 
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
        System.out.println();
    }

    
    public static void cekStokCabang4(int[] stokCabang4) {
        
        int[] bungaMati = {-1, -2, 0, -5}; 
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("Stok RoyalGarden 4 setelah pengurangan bunga mati:");
        for (int i = 0; i < stokCabang4.length; i++) {
            int stokAkhir = stokCabang4[i] + bungaMati[i];
            System.out.println(namaBunga[i] + ": " + stokAkhir);
        }
    }
}
