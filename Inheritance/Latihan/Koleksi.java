public class Koleksi{
    protected String judul;
    protected String penerbit;
    protected int tahun;

    public Koleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public String toString(){
        return "Judul: " + judul + ",Penerbit: " + penerbit + ",Tahun: " + tahun;
    }
}