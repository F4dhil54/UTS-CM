

public class MataKuliah {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public MataKuliah() {
    }

    public MataKuliah(String kode, String nama, int sks) {
        this.kodeMK = kode;
        this.namaMK = nama;
        this.sks = sks;
    }

    public void tammpilMataKuliah() {
        System.out.println("Kode       : " + kodeMK + "|Nama       : " + namaMK + "|SKS        : " + sks);
    }
}