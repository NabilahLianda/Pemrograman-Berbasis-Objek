import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pembeli {
    private List<Item> keranjang = new ArrayList<>();

    public void pesanItem(Penjual penjual, Scanner scanner) {
        boolean lanjut = true;
        double totalHargaAkhir = 0;  // akumulasi total harga semua transaksi

        while (lanjut) {
            System.out.println("\n===== Daftar Menu =====");
            System.out.println("1. Bakso Halus");
            System.out.println("2. Bakso Urat");
            System.out.println("3. Bakso Telur Puyuh");
            System.out.println("4. Bakwan");
            System.out.println("5. Tahu Goreng");
            System.out.println("6. Mie Bihun");
            System.out.print("Pilih item (1-6): ");
            int pilihan = scanner.nextInt();
            System.out.print("Jumlah yang ingin dibeli: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer input

            String namaItem = "";
            switch (pilihan) {
                case 1:
                    namaItem = "Bakso Halus";
                    break;
                case 2:
                    namaItem = "Bakso Urat";
                    break;
                case 3:
                    namaItem = "Bakso Telur Puyuh";
                    break;
                case 4:
                    namaItem = "Bakwan";
                    break;
                case 5:
                    namaItem = "Tahu Goreng";
                    break;
                case 6:
                    namaItem = "Mie Bihun";
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // kembali ke menu pembelian
            }

            int stokTersedia = 0;
            for (Item item : penjual.getStok()) {
                if (item.getNama().equals(namaItem) && !item.isTerjual()) {
                    stokTersedia++;
                }
            }
            if (stokTersedia < jumlah) {
                System.out.println("Stok tidak mencukupi. Coba kurangi jumlah pembelian.");
                continue;
            }

            int dibeli = 0;
            double totalHargaTransaksi = 0; // total harga untuk transaksi ini
            for (Item item : penjual.getStok()) {
                if (item.getNama().equals(namaItem) && !item.isTerjual() && dibeli < jumlah) {
                    item.setTerjual(true);
                    penjual.getTerjual().add(item);
                    keranjang.add(item);
                    totalHargaTransaksi += item.getHargaJual();
                    dibeli++;
                    if (dibeli == jumlah) { break; }
                }
            }
            totalHargaAkhir += totalHargaTransaksi;
            System.out.println("\nItem berhasil ditambahkan! Total untuk " + namaItem + ": Rp" + totalHargaTransaksi);

            System.out.print("Apakah Anda ingin membeli item lain? (y/n): ");
            String jawab = scanner.nextLine().trim().toLowerCase();
            if (!jawab.equals("y")) {
                lanjut = false;
            }
        }

        // Membuat ringkasan pembelian
        Map<String, Integer> ringkasan = new HashMap<>();
        for (Item item : keranjang) {
            ringkasan.put(item.getNama(), ringkasan.getOrDefault(item.getNama(), 0) + 1);
        }

        System.out.println("\n===== Ringkasan Pembelian =====");
        for (Map.Entry<String, Integer> entry : ringkasan.entrySet()) {
            String nama = entry.getKey();
            int jumlahBeli = entry.getValue();
            double harga = 0;
            for (Item item : keranjang) {
                if (item.getNama().equals(nama)) {
                    harga = item.getHargaJual();
                    break;
                }
            }
            System.out.println(nama + " x" + jumlahBeli + " = Rp" + (harga * jumlahBeli));
        }
        System.out.println("Total yang harus dibayar: Rp" + totalHargaAkhir);
    }
}
