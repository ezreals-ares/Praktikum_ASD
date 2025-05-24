package Praktikum_ASD.Jobsheet11.Percobaan;
import java.util.Scanner;
public class SLLMain21 {

      static Scanner sc = new Scanner(System.in);

      public static Mahasiswa21 inputMahasiswa() {
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa21(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        SingleLinkedList21 list = new SingleLinkedList21();
        int pilihan;

        do {
            System.out.println("\n===== MENU LINKED LIST =====");
            System.out.println("1. Tambah data di awal (addFirst)");
            System.out.println("2. Tambah data di akhir (addLast)");
            System.out.println("3. Tambah data di index tertentu (insertAt)");
            System.out.println("4. Tambah data setelah nama tertentu (insertAfter)");
            System.out.println("5. Tampilkan data (print)");
            System.out.println("6. Ambil data berdasarkan index (getData)");
            System.out.println("7. Cari index berdasarkan nama (indexOf)");
            System.out.println("8. Hapus data pertama (removeFirst)");
            System.out.println("9. Hapus data terakhir (removeLast)");
            System.out.println("10. Hapus data berdasarkan nama (remove)");
            System.out.println("11. Hapus data berdasarkan index (removeAt)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa());
                    break;
                case 2:
                    list.addLast(inputMahasiswa());
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    list.insertAt(idx, inputMahasiswa());
                    break;
                case 4:
                    System.out.print("Masukkan nama setelah siapa akan disisipkan: ");
                    String key = sc.nextLine();
                    list.insertAfter(key, inputMahasiswa());
                    break;
                case 5:
                    System.out.println("Isi Linked List:");
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan index yang ingin diambil: ");
                    int getIdx = sc.nextInt();
                    sc.nextLine();
                    list.getData(getIdx);
                    break;
                case 7:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String searchName = sc.nextLine();
                    int index = list.indexOf(searchName);
                    if (index != -1) {
                        System.out.println("Index: " + index);
                    } else {
                        System.out.println("Nama tidak ditemukan.");
                    }
                    break;
                case 8:
                    list.removeFirst();
                    break;
                case 9:
                    list.removeLast();
                    break;
                case 10:
                    System.out.print("Masukkan nama mahasiswa yang ingin dihapus: ");
                    String delName = sc.nextLine();
                    list.remove(delName);
                    break;
                case 11:
                    System.out.print("Masukkan index data yang ingin dihapus: ");
                    int delIndex = sc.nextInt();
                    sc.nextLine();
                    list.removeAt(delIndex);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
