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
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar Mata Kuliah:");
                    for (MataKuliah mk : daftarMK) {
                        mk.tampilMatakuliah();
                    }
                    break;
                case 3:
                    System.out.println("\nData Penilaian:");
                    for (Penilaian p : dataPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;
    }
}