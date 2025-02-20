package Praktikum_ASD.Jobsheet2;

class Mahasiswa21 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahkelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        } else {
            ipk = ipkBaru;
        } 
    }

    String menilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baiik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}