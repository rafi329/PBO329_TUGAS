import java.util.ArrayList;

public class Bengkel {
    private String nama;
    private ArrayList<Pelanggan> pelangganList = new ArrayList<>();
    private ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public Bengkel(String nama) {
        this.nama = nama;
    }
    public String getnama() {
        return nama;
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public ArrayList<Pelanggan> getPelangganList() {
        return pelangganList;
    }
}
