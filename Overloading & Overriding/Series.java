public class Series extends Transformer{
    double rating;
    String namaVillain;
    String namaProtagonis;

    public Series(String judul, String subJudul, String sutradara, int tahun, int durasi, double rating, String namaProtagonis, String namaVillain){
        super(judul, subJudul, sutradara, durasi, tahun);
        this.rating = rating;
        this.namaProtagonis = namaProtagonis;    
        this.namaVillain = namaVillain;
    }

    public void showInfo(){
        super.showInfo(true);
        System.out.println("Rating: " + this.rating + "/5 pada rating Google");
        System.out.println("Protagonis: " + this.namaProtagonis);
        System.out.println("Antagonis: " + this.namaVillain);
    }
}