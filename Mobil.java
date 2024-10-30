public class Mobil extends Kendaraan {

    public Mobil(String platNomor, String merk) {
        super(platNomor, merk);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil - Plat Nomor: " + getPlatNomor() + ", Merk: " + getMerk());
    }
}
