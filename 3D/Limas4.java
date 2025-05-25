public class Limas4 {
    int panjang;
    int lebar;
    int tinggi;

    public Limas4(){
    }

    public Limas4(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void desLimas4(){
        System.out.println("Panjang Limas4 = " + this.panjang);
        System.out.println("Lebar Limas4 = " + this.lebar);
        System.out.println("Tinggi Limas4 = " + this.tinggi);
        System.out.println("Volume Limas4 = " + getVolume());
    }

    public double getVolume() {
        double output=this.panjang * this.lebar * this.tinggi / 3;
        return output;
    }
}