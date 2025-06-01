package Praktikum_ASD.Jobsheet12.Percobaan;
import java.util.Scanner;

public class DLLMain21 {
    static Scanner sc = new Scanner(System.in);

    static public Mahasiswa21 inputMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa21(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList21 list = new DoubleLinkedList21();
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah nama tertentu");
            System.out.println("8. Tambah data di index tertentu");
            System.out.println("9. Menghapus data setelah data tertrntu");
            System.out.println("10. Menghapus data di index tertentu");
            System.out.println("11. Menampilkan data pertama");
            System.out.println("12. Menampilkan data terkahir");
            System.out.println("13. Menampilkan data pada index tertentu");
            System.out.println("14. Menampilkan jumlah data saat ini");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa21 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                }

                case 2 -> {
                    Mahasiswa21 mhs = inputMahasiswa();
                    list.addLast(mhs);
                }

                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node21 found = list.search(nim);
                    if(found != null) {
                        System.out.println("Data Ditemukan");
                        found.data.tampilInformasi();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan nama setelah siapa akan disisipkan");
                    String key = sc.nextLine();
                    list.insertAfter(key, inputMahasiswa());
                }

                case 8 -> {
                    System.out.print("Masukkan index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    list.add(idx, inputMahasiswa());
                }

                case 9 -> {
                    System.out.print("Data akan dihapus setelah NIM: ");
                    String nim = sc.nextLine();
                    list.removeAfter(nim);
                }

                case 10 -> {
                    System.out.print("Masukan index mana yang ingin di hapus: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    list.remove(idx);
                }

                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan data index yang ingin ditampilkan: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    list.getIndex(idx);
                }
                case 14 -> list.getSize();
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
