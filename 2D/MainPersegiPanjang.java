public class MainPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang kotak1 = new PersegiPanjang();
        kotak1.setPanjang(5);
        kotak1.setLebar(2);
        System.out.println("Sisi Persegi Panjang = " + kotak1.getPanjang());
        System.out.println("Sisi Persegi Panjang = " + kotak1.getLebar());
        System.out.println("Luas Persegi Panjang = " + kotak1.getLuas());
        System.out.println("Keliling Persegi Panjang = " + kotak1.getKeliling());
    }
}