class Skripsi extends Buku{
    public String NPM;

    public Skripsi(String NPM, String penulis, String judul, String penerbit, int tahun){
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }

    public String toString(){
        return super.toString() + ",NPM: " + NPM;
    }

}

