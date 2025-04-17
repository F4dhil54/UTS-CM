package UTS;

import java.util.Scanner;

import Mahasiswa;
import MataKuliah;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa [] mhs = {
            new Mahasiswa ("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa ("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
        };

        MataKuliah [] matkul = {
            new MataKuliah ("MK001", "Struktur Data", 3),
            new MataKuliah ("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3),
        };

        Penilaian [] nilai = {
            new Penilaian(mhs[0], matkul[0], 80, 85, 90),
            new Penilaian(mhs[0], matkul[0], 75, 80, 85),
            new Penilaian(mhs[1], matkul[1], 70, 75, 80),
            new Penilaian(mhs[2], matkul[2], 65, 70, 75),
            new Penilaian(mhs[2], matkul[2], 50, 55, 60),
        };

        int pilih;

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    for (Mahasiswa datamhs : mhs) {
                        datamhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    for (MataKuliah datamatkul : matkul) {
                        datamatkul.tammpilMataKuliah();
                    }
                    break;
                case 3:
                    for (Penilaian datanilai : nilai) {
                        datanilai.tampilNilai();
                    }
                    break;
                case 4:
                    Penilaian.bubbleSort(nilai);
                    for (Penilaian penilaian : nilai) {
                        penilaian.tampilNilai();
                    }
                    break;
                case 5:
                    System.out.println("Cari Mahasiswa Berdasarkan NiM : ");
                    String nim = input.next();
                    Mahasiswa.sequentialSearching (mhs,nim);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } 
        while (pilih != 0);
        input.close();
    }
}
