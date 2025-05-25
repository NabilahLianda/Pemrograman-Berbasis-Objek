public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int getLuas() {
        return this.panjang * this.lebar;
    }

    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}