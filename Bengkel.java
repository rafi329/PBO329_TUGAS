import java.util.ArrayList;

public class Bengkel {
    private String Nama;
    private ArrayList<Pelanggan> pelangganList = new ArrayList<>();
    private ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public Bengkel(String Nama) {
        this.Nama = Nama;
    }
    public String getNama() {
        return Nama;
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
