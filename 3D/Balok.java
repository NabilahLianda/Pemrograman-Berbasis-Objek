public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok(){
    }

    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void desBalok(){
        System.out.println("Panjang Balok = " + this.panjang);
        System.out.println("Lebar Balok = " + this.lebar);
        System.out.println("Tinggi Balok = " + this.tinggi);
        System.out.println("Volume Balok = " + getVolume());
    }

    public int getVolume() {
        int output=this.panjang * this.lebar * this.tinggi;
        return output;
    }
}