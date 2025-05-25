public class Lingkaran {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getLuas() {
        return 3.14 * this.radius * this.radius;
    }

    public double getKeliling() {
        return 2 * 3.14 * this.radius;
    }
}