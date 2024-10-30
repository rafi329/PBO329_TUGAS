import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String kontak;
    private ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public ArrayList<Kendaraan> getKendaraanList() {
        return kendaraanList;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }
}
