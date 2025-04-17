public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    public Penilaian(Mahasiswa mhs, MataKuliah mk, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.mataKuliah = mk;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilPenilaian() {
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | Nilai Akhir: " + nilaiAkhir);
    }
}