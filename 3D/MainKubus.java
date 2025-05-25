public class MainKubus {
    public static void main(String[] args) {
        Kubus [] kotak = new Kubus[5];
        kotak[0] = new Kubus(5);
        kotak[1] = new Kubus(8);    
        kotak[2] = new Kubus(10);
        kotak[3] = new Kubus(15);
        kotak[4] = new Kubus(20);

        for (int i = 0; i < kotak.length; i++) {
            System.out.println("Kubus Ke-" + (i + 1) + ":");
            kotak[i].desKubus();
            System.out.println();
        }

        int totalVolume = 0;
        for (Kubus k : kotak){
            totalVolume += k.getVolume();
        }

        double ratarata = (double)totalVolume / kotak.length;
        System.out.println("Rata-Rata Volume Kubus = " + ratarata);
    }
}