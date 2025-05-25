public class MainBola {
    public static void main(String[] args) {
        Bola [] bulat = new Bola[5];
        bulat[0] = new Bola(4);
        bulat[1] = new Bola(7); 
        bulat[2] = new Bola(10);
        bulat[3] = new Bola(14);
        bulat[4] = new Bola(17);

        for (int i = 0; i < bulat.length; i++) {
            System.out.println("Bola Ke-" + (i + 1) + ":");
            bulat[i].desBola();
            System.out.println();
        }

        double totalVolume = 0;
        for (Bola b : bulat){
            totalVolume += b.getVolume();
        }

        double ratarata = totalVolume / bulat.length;
        System.out.println("Rata-Rata Volume Bola = " + ratarata);
    }
}