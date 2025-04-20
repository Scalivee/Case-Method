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
            System.out.println("=== MENU SISTEM AKADEMIK ===");
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
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (MataKuliah mk : daftarMK) {
                        mk.tampilMatakuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian:");
                    for (Penilaian p : dataPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;
                case 4:
                    System.out.println("Data Penilaian:");
                    for (int i = 0; i < dataPenilaian.length - 1; i++) {
                        for (int j = 0; j < dataPenilaian.length - 1 - i; j++) {
                            if (dataPenilaian[j].nilaiAkhir < dataPenilaian[j + 1].nilaiAkhir) {
                                Penilaian temp = dataPenilaian[j];
                                dataPenilaian[j] = dataPenilaian[j + 1];
                                dataPenilaian[j + 1] = temp;
                            }
                        }
                    }

                    for (Penilaian p : dataPenilaian) {
                        p.tampilPenilaian();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cariNIM = sc.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.NIM.equals(cariNIM)) {
                            System.out.println("Mahasiswa Ditemukan: NIM: " + mhs.NIM + " | Nama: " + mhs.nama
                                    + " | Prodi: " + mhs.prodi);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
