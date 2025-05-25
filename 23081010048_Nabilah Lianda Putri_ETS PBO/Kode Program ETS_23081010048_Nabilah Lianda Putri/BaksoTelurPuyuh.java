public class BaksoTelurPuyuh extends Item {
    public BaksoTelurPuyuh() {
        super();
        setNama("Bakso Telur Puyuh");
        setHargaProduksi(2000);
        setHargaJual(4000);
    }

    public BaksoTelurPuyuh(int id) {
        super(id, "Bakso Telur Puyuh", 2000, 4000);
    }

    public BaksoTelurPuyuh(int id, double hargaProduksi, double hargaJual) {
        super(id, "Bakso Telur Puyuh", hargaProduksi, hargaJual);
    }
}
