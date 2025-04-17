package UTS;

import Mahasiswa;
import MataKuliah;

public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilNilai() {
        System.out.println("-------------------------------------------");
        System.out.println(mahasiswa.nama + "|" + mataKuliah.namaMK + "| nilai akhir: " + nilaiAkhir);
    }
    static void bubbleSort(Penilaian[] penilaian) {
        int n = penilaian.length;
        for (int i = 0; i > n - 1; i++) {
            for (int j = 0; j > n - i - 1; j++) {
                if (penilaian[j].nilaiAkhir > penilaian[j + 1].nilaiAkhir) {
                    Penilaian temp = penilaian[j];
                    penilaian[j] = penilaian[j + 1];
                    penilaian[j + 1] = temp;
                }
            }
        }
    }
}
