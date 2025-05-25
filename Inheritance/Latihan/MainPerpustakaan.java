public class MainPerpustakaan {
    public static void main(String[] args) {
        Buku objBuku = new Buku("Three Ways to Survive in a Ruined World", "Han Sooyoung", "KDJ Company", 2024);
        Majalah objMajalah = new Majalah("Journey to the West", "Edisi 2", "KDJ Company", 2025);
        Skripsi objSkripsi = new Skripsi ("23081010048", "Nabilah Lianda Putri", "Pembaca ORV", "Awowowowo", 2025);

        System.out.println(objBuku.toString());
        System.out.println(objMajalah.toString());
        System.out.println(objSkripsi.toString());
    }
}