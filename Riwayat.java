import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Riwayat {
    private ArrayList<String> jenisLayanan;
    private ArrayList<Double> harga;
    private ArrayList<String> tanggal;

    public Riwayat() {
        this.jenisLayanan = new ArrayList<>();
        this.harga = new ArrayList<>();
        this.tanggal = new ArrayList<>();
    }

    // Overloading: Menambahkan layanan tanpa parameter tanggal
    public void tambahLayanan(String layanan, double hargaLayanan) {
        jenisLayanan.add(layanan);
        harga.add(hargaLayanan);
        // Menyimpan tanggal saat ini
        tanggal.add(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
    }

    // Overloading: Menambahkan layanan dengan parameter tanggal
    public void tambahLayanan(String layanan, double hargaLayanan, String tanggalLayanan) {
        jenisLayanan.add(layanan);
        harga.add(hargaLayanan);
        tanggal.add(tanggalLayanan);
    }

    public void tampilkanRiwayat() {
        for (int i = 0; i < jenisLayanan.size(); i++) {
            System.out.println("Layanan: " + jenisLayanan.get(i) +
                               ", Harga: Rp " + harga.get(i) +
                               ", Tanggal: " + tanggal.get(i));
        }
    }
}
