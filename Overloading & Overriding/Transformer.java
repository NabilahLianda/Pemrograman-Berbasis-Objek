public class Transformer extends Film{
    String subJudul;

    public Transformer(String judul, String subJudul, String sutradara, int tahun, int durasi){
        super(judul, sutradara, tahun, durasi);
        this.subJudul = subJudul;
    }

    public void showInfo(boolean includesubJudul){
        super.showInfo();
        if (includesubJudul){
            System.out.println("Sub Judul: " + this.subJudul);
        }
    }
}