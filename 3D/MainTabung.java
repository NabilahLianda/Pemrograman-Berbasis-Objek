public class MainTabung {
    public static void main(String[] args) {
        Tabung [] bulat = new Tabung[5];
        bulat[0] = new Tabung(4, 8);
        bulat[1] = new Tabung(7, 10);    
        bulat[2] = new Tabung(10, 12);
        bulat[3] = new Tabung(14, 20);
        bulat[4] = new Tabung(15, 25);

        for (int i = 0; i < bulat.length; i++) {
            System.out.println("Tabung Ke-" + (i + 1) + ":");
            bulat[i].desTabung();
            System.out.println();
        }

        double totalVolume = 0;
        for (Tabung b : bulat){
            totalVolume += b.getVolume();
        }

        double ratarata = totalVolume / bulat.length;
        System.out.println("Rata-Rata Volume Tabung = " + ratarata);
    }    
}