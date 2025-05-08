package Praktikum_ASD.Jobsheet9;
import java.util.Scanner;
public class MahasiswaDemo21 {

    public static void main(String[] args) {
        StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) { 
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s telah dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa21 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
                    }
                    break;
                case 3:
                    Mahasiswa21 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas teratas adalah %s\n", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua Tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }

        } while(pilih >= 1 && pilih <= 4);

        sc.close();
      
    }
}