public class Kubus {
    int sisi;
    
    public Kubus() {
    }

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public void desKubus() {
        System.out.println("Sisi Kubus = " + this.sisi);
        System.out.println("Volume Kubus = " + getVolume());
    }

    public int getVolume() {
        int output = this.sisi * this.sisi * this.sisi;
        return output;
    }
}