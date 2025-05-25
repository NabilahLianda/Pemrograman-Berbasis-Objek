public class Bola {
    int rasio;

    public Bola(){
    }

    public Bola(int rasio) {
        this.rasio = rasio;
    }

    public void desBola() {
        System.out.println("Rasio Bola = " + this.rasio);
        System.out.println("Volume Bola = " + getVolume());
    }

    public double getVolume() {
        double output=4 / 3 * 3.14 * this.rasio * this.rasio * this.rasio;
        return output;
    }
}