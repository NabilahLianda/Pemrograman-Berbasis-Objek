public class Item {
    private int id;
    private String nama;
    private double hargaProduksi;
    private double hargaJual;
    private boolean terjual;

    public Item() {
        this.id = 0;
        this.nama = "Item";
        this.hargaProduksi = 0;
        this.hargaJual = 0;
        this.terjual = false;
    }

    public Item(String nama, double hargaProduksi, double hargaJual) {
        this.id = 0;
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.terjual = false;
    }

    public Item(int id, String nama, double hargaProduksi, double hargaJual) {
        this.id = id;
        this.nama = nama;
        this.hargaProduksi = hargaProduksi;
        this.hargaJual = hargaJual;
        this.terjual = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHargaProduksi() {
        return hargaProduksi;
    }

    public void setHargaProduksi(double hargaProduksi) {
        this.hargaProduksi = hargaProduksi;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public boolean isTerjual() {
        return terjual;
    }

    public void setTerjual(boolean terjual) {
        this.terjual = terjual;
    }

    @Override
    public String toString() {
        return nama + " (ID: " + id +
                ", Jual: Rp" + hargaJual +
                ", Modal: Rp" + hargaProduksi +
                ", Terjual: " + (terjual ? "Ya" : "Belum") + ")";
    }
}
