class Buku extends Koleksi{
    private String penulis;

    public Buku(String judul, String penulis, String penerbit, int tahun){
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public String toString(){
        return super.toString() + ",Penulis: " + penulis;
    }
}