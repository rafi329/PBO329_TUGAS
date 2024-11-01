import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bengkel bengkel = new Bengkel("Bengkel Terbaik");

        System.out.println("   === " + bengkel.getNama() + " ===");
        System.out.println();
        System.out.println("=== Sistem Manajemen Bengkel ===");
        
        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan kontak pelanggan: ");
        String kontakPelanggan = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaPelanggan, kontakPelanggan);
        bengkel.tambahPelanggan(pelanggan);

        // Input data beberapa kendaraan
        boolean tambahKendaraanLagi = true;
        while (tambahKendaraanLagi) {
            System.out.println("\n=== Masukkan Informasi Kendaraan ===");
            System.out.print("Jenis kendaraan (1. Mobil, 2. Motor): ");
            int jenisKendaraan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline dari input

            System.out.print("Masukkan plat nomor: ");
            String platNomor = scanner.nextLine();
            System.out.print("Masukkan merk kendaraan: ");
            String merk = scanner.nextLine();

            Kendaraan kendaraan;
            if (jenisKendaraan == 1) {
                kendaraan = new Mobil("", "");
            } else {
                kendaraan = new Motor("", "");
            }
            kendaraan.setPlatNomor(platNomor);
            kendaraan.setMerk(merk);
            pelanggan.tambahKendaraan(kendaraan);

           
            // Tanya apakah ingin menambahkan kendaraan lagi
            System.out.print("Apakah ingin menambah kendaraan lagi? (y/n): ");
            String pilihan = scanner.nextLine();
            tambahKendaraanLagi = pilihan.equalsIgnoreCase("y");
        }

        // Mencatat layanan untuk setiap kendaraan
        for (Kendaraan kendaraan : pelanggan.getKendaraanList()) {
            System.out.println("\n=== Pilihan Layanan untuk Kendaraan " + kendaraan.getPlatNomor() + " ===");
            System.out.println("1. Perbaikan Mesin - Rp 500.000");
            System.out.println("2. Penggantian Oli - Rp 100.000");
            System.out.println("3. Cuci Kendaraan - Rp 50.000");
            System.out.print("Pilih layanan (1-3): ");
            int pilihanLayanan = scanner.nextInt();
            
            double hargaLayanan = 0;
            String jenisLayanan = "";

            switch (pilihanLayanan) {
                case 1:
                    jenisLayanan = "Perbaikan Mesin";
                    hargaLayanan = 500000;
                    break;
                case 2:
                    jenisLayanan = "Penggantian Oli";
                    hargaLayanan = 100000;
                    break;
                case 3:
                    jenisLayanan = "Cuci Kendaraan";
                    hargaLayanan = 50000;
                    break;
                default:
                    System.out.println("Pilihan layanan tidak valid!");
                    continue; // Allow user to choose again
            }

            // Memanggil overload yang otomatis menambah tanggal
            kendaraan.tambahRiwayat(jenisLayanan, hargaLayanan);
        }

        // Menampilkan riwayat layanan untuk setiap kendaraan
        System.out.println("\n=== Riwayat Servis Kendaraan ===");
        for (Kendaraan kendaraan : pelanggan.getKendaraanList()) {
            kendaraan.tampilkanInfo(); // Menampilkan info kendaraan
            kendaraan.tampilkanRiwayat(); // Menampilkan riwayat servis
            System.out.println();
        }

        scanner.close();
    }
}
