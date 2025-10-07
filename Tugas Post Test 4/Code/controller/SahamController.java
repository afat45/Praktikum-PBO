package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
import model.Saham;
import model.Wallet;

public class SahamController {

    public static void showSahamMenu() {
    Scanner input = new Scanner(System.in);
    while (true) {
            clearScreen();
        System.out.println("""
                           ------------------------------------------------
                           Selamat datang di Menu Saham
                           ------------------------------------------------
                           Pilih saham yang ingin kamu beli:
                           1. Big Mall
                           2. Inforsa Group
                           3. Rizky Jaya Rezeki Group
                           4. PT. Kami Manusia Juga
                           5. Kembali ke Menu Utama
                           ------------------------------------------------
                           Saldo Kamu: Rp.""" + String.format("%,d", Wallet.myWallet.getSaldo()));
        System.out.print("\nKetik Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("Big Mall");
System.out.println("120k|         *        *");
System.out.println("110k|   *        *");
System.out.println("100k|      *        *");
System.out.println(" 90k|   *      *");
System.out.println(" 80k+-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Big Mall: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Saham.bigMall.invest(invest);
                    System.out.println("Berhasil membeli saham Big Mall sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 2 -> {
                System.out.println("Inforsa Group");
System.out.println("90k |        *        *");
System.out.println("80k |   *       *");
System.out.println("70k |      *       *");
System.out.println("60k |   *       *");
System.out.println("50k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Inforsa Group: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Saham.inforsaGroup.invest(invest);
                    System.out.println("Berhasil membeli saham Inforsa Group sebesar Rp" + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 3 -> {
                System.out.println("Rizky Jaya Rezeki Group");
System.out.println("70k |   *        *");
System.out.println("60k |       *        *");
System.out.println("50k |   *       *");
System.out.println("40k |       *       *");
System.out.println("30k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Rizky Jaya Rezeki Group: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Saham.rizkyJayaRezekiGroup.invest(invest);
                    System.out.println("Berhasil membeli saham Rizky Jaya Rezeki Group sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 4 -> {
                System.out.println("PT. Kami Manusia Juga");
System.out.println("100k|   *       *");
System.out.println(" 90k|       *       *");
System.out.println(" 80k|   *      *");
System.out.println(" 70k+-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di PT. Kami Manusia Juga: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Saham.ptKamiManusiaJuga.invest(invest);
                    System.out.println("Berhasil membeli saham PT. Kami Manusia Juga sebesar Rp." + invest);
                } else {
                    System.out.println("Saldo tidak cukup!");
                }
            }
            case 5 -> {
                System.out.println("Kembali ke Menu Utama...");
                return;
            }
            default -> System.out.println("Pilihan tidak valid!");
        }
        System.out.println();
    }
}
}