package UTS;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("nim : " + nim + "|nama : " + nama + "|prodi : " + prodi);
    }

    public static void sequentialSearching(Mahasiswa[] data, String NIM) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].nim.equalsIgnoreCase(NIM)) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                data[i].tampilMahasiswa();
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }
}