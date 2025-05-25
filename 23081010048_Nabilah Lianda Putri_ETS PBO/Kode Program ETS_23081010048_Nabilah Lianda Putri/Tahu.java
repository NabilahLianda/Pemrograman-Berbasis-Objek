public class Tahu extends Item {
    public Tahu() {
        super();
        setNama("Tahu");
        setHargaProduksi(500);
        setHargaJual(1000);
    }

    public Tahu(int id) {
        super(id, "Tahu", 500, 1000);
    }

    public Tahu(int id, double hargaProduksi, double hargaJual) {
        super(id, "Tahu", hargaProduksi, hargaJual);
    }
}
