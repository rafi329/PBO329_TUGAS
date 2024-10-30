public class Motor extends Kendaraan {

    public Motor(String platNomor, String merk) {
        super(platNomor, merk);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor - Plat Nomor: " + getPlatNomor() + ", Merk: " + getMerk());
    }
}
