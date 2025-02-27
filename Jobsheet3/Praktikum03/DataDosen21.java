package Praktikum_ASD.Jobsheet3.Praktikum03;

public class DataDosen21 {

    void dataSemuaDosen(Dosen21[] dosen) {
        System.out.println("Data Dosen");
        for(Dosen21 d : dosen) {
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + d.jenisKelamin);
            System.out.println("Usia: " + d.usia);
            System.out.println("===================================");
        }
    }

    void jumlahDataPerjenisKelamin(Dosen21[] dosen) {
        int laki = 0;
        int perempuan = 0;
        for(Dosen21 d : dosen) {
            if(d.jenisKelamin.equalsIgnoreCase("L")) {
                laki++;
            } else {
                perempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + laki);
        System.out.println("Jumlah Dosen Perempuan: " + perempuan);
    }

    void rerataUsia(Dosen21[] dosen) {
        int totalUsia = 0;
        for(Dosen21 d : dosen) {
            totalUsia += d.usia;
        }
        System.out.println("Rerata Usia Dosen: " + (totalUsia / dosen.length));
    }

    void infoDosenPalingTua(Dosen21[] dosen) {
        Dosen21 dosenTua = dosen[0];
        for(Dosen21 d : dosen) {
            if(d.usia > dosenTua.usia) {
                dosenTua = d;
            }
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode: " + dosenTua.kode);
        System.out.println("Nama: " + dosenTua.nama);
        System.out.println("Jenis Kelamin: " + dosenTua.jenisKelamin);
        System.out.println("Usia: " + dosenTua.usia);
    }

    void infoDosenPalingMuda(Dosen21[] dosen) {
        Dosen21 dosenMuda = dosen[0];
        for(Dosen21 d : dosen) {
            if(d.usia < dosenMuda.usia) {
                dosenMuda = d;
            }
        }
        System.out.println("Dosen Paling Muda");
        System.out.println("Kode: " + dosenMuda.kode);
        System.out.println("Nama: " + dosenMuda.nama);
        System.out.println("Jenis Kelamin: " + dosenMuda.jenisKelamin);
        System.out.println("Usia: " + dosenMuda.usia);
    }
}