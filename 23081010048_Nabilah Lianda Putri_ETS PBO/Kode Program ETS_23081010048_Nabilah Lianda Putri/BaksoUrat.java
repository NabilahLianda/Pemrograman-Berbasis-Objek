public class BaksoUrat extends Item {
    public BaksoUrat() {
        super();
        setNama("Bakso Urat");
        setHargaProduksi(2000);
        setHargaJual(3500);
    }

    public BaksoUrat(int id) {
        super(id, "Bakso Urat", 2000, 3500);
    }

    public BaksoUrat(int id, double hargaProduksi, double hargaJual) {
        super(id, "Bakso Urat", hargaProduksi, hargaJual);
    }
}
