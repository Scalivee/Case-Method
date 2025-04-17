import java.util.Scanner;

public class MainSiakad {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] daftarMK = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        Penilaian[] dataPenilaian = {
            new Penilaian(daftarMahasiswa[0], daftarMK[0], 80, 85, 90),
            new Penilaian(daftarMahasiswa[0], daftarMK[1], 60, 75, 70),
            new Penilaian(daftarMahasiswa[1], daftarMK[0], 75, 70, 80),
            new Penilaian(daftarMahasiswa[2], daftarMK[1], 85, 90, 95),
            new Penilaian(daftarMahasiswa[2], daftarMK[2], 80, 90, 65)
        };
    }
}