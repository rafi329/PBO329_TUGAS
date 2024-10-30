public abstract class Kendaraan {
    private String platNomor;
    private String merk;
    private Riwayat riwayatServis;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.riwayatServis = new Riwayat(); // Membuat objek riwayat baru
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Overloading: Menambah layanan dengan tanggal otomatis
    public void tambahRiwayat(String jenisLayanan, double harga) {
        riwayatServis.tambahLayanan(jenisLayanan, harga); // Menggunakan metode yang otomatis menambahkan tanggal
    }

    // Overloading: Menambah layanan dengan tanggal tertentu
    public void tambahRiwayat(String jenisLayanan, double harga, String tanggal) {
        riwayatServis.tambahLayanan(jenisLayanan, harga, tanggal);
    }

    public void tampilkanRiwayat() {
        riwayatServis.tampilkanRiwayat();
    }

    public abstract void tampilkanInfo();
}
