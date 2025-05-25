public class MainLimas4 {
    public static void main(String[] args) {
        Limas4 [] piramid = new Limas4[5];
        piramid[0] = new Limas4(4, 3, 2);
        piramid[1] = new Limas4(5, 4, 3);
        piramid[2] = new Limas4(8, 7, 6);
        piramid[3] = new Limas4(10, 9, 8);
        piramid[4] = new Limas4(15, 14, 13);

        for (int i = 0; i < piramid.length; i++) {
            System.out.println("Limas Ke-" + (i + 1) + ":");
            piramid[i].desLimas4();
            System.out.println();
        }

        double totalVolume = 0;
        for (Limas4 p : piramid){
            totalVolume += p.getVolume();
        }

        double ratarata = totalVolume / piramid.length;
        System.out.println("Rata-Rata Volume Limas = " + ratarata);
    }
}