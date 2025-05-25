public class BaksoHalus extends Item {
    public BaksoHalus() {
        super();
        setNama("Bakso Halus");
        setHargaProduksi(2000);
        setHargaJual(3000);
    }

    public BaksoHalus(int id) {
        super(id, "Bakso Halus", 2000, 3000);
    }

    public BaksoHalus(int id, double hargaProduksi, double hargaJual) {
        super(id, "Bakso Halus", hargaProduksi, hargaJual);
    }
}
