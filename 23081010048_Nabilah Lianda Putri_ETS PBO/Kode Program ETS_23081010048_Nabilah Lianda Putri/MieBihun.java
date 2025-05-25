public class MieBihun extends Item {
    public MieBihun() {
        super();
        setNama("Mie Bihun");
        setHargaProduksi(1000);
        setHargaJual(2000);
    }

    public MieBihun(int id) {
        super(id, "Mie Bihun", 1000, 2000);
    }

    public MieBihun(int id, double hargaProduksi, double hargaJual) {
        super(id, "Mie Bihun", hargaProduksi, hargaJual);
    }
}
