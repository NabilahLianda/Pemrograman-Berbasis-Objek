public class Bakwan extends Item {
    public Bakwan() {
        super();
        setNama("Bakwan");
        setHargaProduksi(1000);
        setHargaJual(2000);
    }

    public Bakwan(int id) {
        super(id, "Bakwan", 1000, 2000);
    }

    public Bakwan(int id, double hargaProduksi, double hargaJual) {
        super(id, "Bakwan", hargaProduksi, hargaJual);
    }
}
