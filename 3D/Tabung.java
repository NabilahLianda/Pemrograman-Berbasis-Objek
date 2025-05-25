public class Tabung {
    int rasio;
    int tinggi;

    public Tabung(){
    }

    public Tabung(int rasio, int tinggi) {
        this.rasio = rasio;
        this.tinggi = tinggi;
    }

    public void desTabung() {
        System.out.println("Rasio Tabung = " + this.rasio);
        System.out.println("Tinggi Tabung = " + this.tinggi);   
        System.out.println("Volume Tabung = " + getVolume());
    }

    public double getVolume() {
        double output=3.14 * this.rasio * this.rasio * this.tinggi;
        return output;
    }
}