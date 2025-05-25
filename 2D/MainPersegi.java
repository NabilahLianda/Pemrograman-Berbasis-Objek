public class MainPersegi {
    public static void main(String[] args) {
        Persegi kotak1 = new Persegi();
        kotak1.setSisi(5);
        System.out.println("Sisi Persegi = " + kotak1.getSisi());
        System.out.println("Luas Persegi = " + kotak1.getLuas());
        System.out.println("Keliling Persegi = " + kotak1.getKeliling());
    }
}