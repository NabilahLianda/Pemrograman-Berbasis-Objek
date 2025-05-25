public class MainBalok {
    public static void main(String[] args) {
        Balok [] kotak = new Balok[5];
        kotak[0] = new Balok(4, 3, 2);
        kotak[1] = new Balok(5, 4, 3);
        kotak[2] = new Balok(8, 7, 6);
        kotak[3] = new Balok(10, 9, 8);
        kotak[4] = new Balok(15, 14, 13);

        for (int i = 0; i < kotak.length; i++) {
            System.out.println("Balok Ke-" + (i + 1) + ":");
            kotak[i].desBalok();
            System.out.println();
        }

        int totalVolume = 0;
        for (Balok k : kotak){
            totalVolume += k.getVolume();
        }

        double ratarata = (double)totalVolume / kotak.length;
        System.out.println("Rata-Rata Volume Balok = " + ratarata);
    }
}