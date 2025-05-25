import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjual penjual = new Penjual();
        Pembeli pembeli = new Pembeli();

        System.out.println("=== Selamat Datang di Warung Kang Maman ===");
        System.out.println("Silakan pilih peran Anda:");
        System.out.println("1. Pembeli");
        System.out.println("2. Kang Maman");
        System.out.print("Aku adalah (1/2): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                pembeli.pesanItem(penjual, scanner);
                break;
            case 2:
            penjual.menuPenjual();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
