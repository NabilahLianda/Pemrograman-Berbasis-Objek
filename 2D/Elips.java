public class Elips {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public double getLuas() {
        return 3.14 * this.a * this.b;
    }

    public double getKeliling() {
        return 2 * 3.14 * Math.sqrt((this.a * this.a + this.b * this.b) / 2);
    }
}