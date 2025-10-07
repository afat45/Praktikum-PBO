package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
import model.Reksadana;
import model.Wallet;

public class ReksadanaController {
    
    public static void showReksadanaMenu() {

    Scanner input = new Scanner(System.in);

    while (true) {
            clearScreen();
        System.out.println("""
                           ------------------------------------------------
                           Selamat datang di Menu Reksadana
                           ------------------------------------------------
                           Pilih produk Reksadana yang ingin kamu beli:
                           1. Reksadana Pasar Segiri
                           2. Reksadana Pasar Malam
                           3. Reksadana Obligasi DPR
                           4. Kembali ke Menu Utama
                           ------------------------------------------------
                           Saldo Kamu: Rp.""" + String.format("%,d", Wallet.myWallet.getSaldo()));
        System.out.print("\nKetik Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("Reksadana Pasar Segiri");
System.out.println("60k |              *");
System.out.println("55k |          *");
System.out.println("50k |       *");
System.out.println("45k |    *");
System.out.println("40k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Reksadana Pasar Segiri: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Reksadana.pasarSegiri.invest(invest);
                    System.out.println("Berhasil membeli Reksadana Pasar Segiri sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 2 -> {
                System.out.println("Reksadana Pasar Malam");
System.out.println("50k |             *");
System.out.println("45k |         *");
System.out.println("40k |      *");
System.out.println("35k |   *");
System.out.println("30k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Reksadana Pasar Malam: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Reksadana.pasarMalam.invest(invest);
                    System.out.println("Berhasil membeli Reksadana Pasar Malam sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 3 -> {
                System.out.println("Reksadana Obligasi DPR");
System.out.println("70k |               *");
System.out.println("65k |          *");
System.out.println("60k |      *");
System.out.println("55k |   *");
System.out.println("50k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Reksadana Obligasi DPR: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Reksadana.obligasiDPR.invest(invest);
                    System.out.println("Berhasil membeli Reksadana Obligasi DPR sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 4 -> {
                System.out.println("Kembali ke Menu Utama...");
                return;
            }
            default -> System.out.println("Pilihan tidak valid!");
        }
        System.out.println();
    }
}
}
