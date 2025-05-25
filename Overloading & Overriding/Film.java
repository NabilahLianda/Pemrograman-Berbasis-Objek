public class Film{
    String judul;
    String sutradara;
    int durasi;
    int tahun;

    public Film(String judul, String sutradara, int tahun, int durasi){
        this.judul = judul;
        this.sutradara = sutradara;
        this.durasi = durasi;
        this.tahun = tahun;
    }

    public void showInfo(){
        System.out.println("Judul Film = " + this.judul);
        System.out.println("Sutradara Film = " + this.sutradara);
        System.out.println("Tahun Film = " + this.tahun);
        System.out.println("Durasi Film = " + this.durasi + " menit");
    }

    public void getDurasi() {
        System.out.println("Durasi Film = " + this.durasi / 60 + " jam " + this.durasi % 60 + " menit");
    }
    
    public void getDurasi(String format) {
        if (format.equalsIgnoreCase("menit")) {
            System.out.println("Durasi Film = " + this.durasi + " menit");
        } else if (format.equalsIgnoreCase("jam")) {
            getDurasi();
        } else {
            System.out.println("Format tidak dikenali");
        }
    }      
}