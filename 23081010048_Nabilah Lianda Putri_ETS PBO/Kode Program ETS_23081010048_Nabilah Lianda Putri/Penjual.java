import java.util.ArrayList;
import java.util.List;

public class Penjual {
    private List<Item> stok;
    private List<Item> terjual;

    public Penjual() {
        stok = new ArrayList<>();
        terjual = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            stok.add(new BaksoHalus(i)); 
            stok.add(new BaksoUrat(i)); 
            stok.add(new BaksoTelurPuyuh(i));
            stok.add(new Bakwan(i)); 
            stok.add(new Tahu(i));        
            stok.add(new MieBihun(i));      
        }
    }

    public void menuPenjual() {
        double totalKeuntungan = 0;
    
        System.out.println("\n=== Daftar Item Terjual ===");
        for (Item item : terjual) {
            System.out.println(item.getNama() + " - Harga Jual: Rp" + item.getHargaJual());
            totalKeuntungan += (item.getHargaJual() - item.getHargaProduksi());
        }
    
        System.out.println("\n=== Daftar Item Tersedia ===");
        int countHalus = 0, countUrat = 0, countTelur = 0, countBakwan = 0, countTahu = 0, countBihun = 0;
    
        for (Item item : stok) {
            if (!item.isTerjual()) {
                switch (item.getNama()) {
                    case "Bakso Halus" -> countHalus++;
                    case "Bakso Urat" -> countUrat++;
                    case "Bakso Telur Puyuh" -> countTelur++;
                    case "Bakwan" -> countBakwan++;
                    case "Tahu" -> countTahu++;
                    case "Mie Bihun" -> countBihun++;
                }
            }
        }
    
        System.out.println("Bakso Halus: " + countHalus + " pcs");
        System.out.println("Bakso Urat: " + countUrat + " pcs");
        System.out.println("Bakso Telur Puyuh: " + countTelur + " pcs");
        System.out.println("Bakwan: " + countBakwan + " pcs");
        System.out.println("Tahu: " + countTahu + " pcs");
        System.out.println("Mie Bihun: " + countBihun + " pcs");
    
        System.out.println("\nTotal Keuntungan: Rp" + totalKeuntungan);
    }
    
    public List<Item> getStok() {
        return stok;
    }

    public List<Item> getTerjual() {
        return terjual;
    }
}
