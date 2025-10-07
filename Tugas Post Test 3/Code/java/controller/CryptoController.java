package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
import model.Crypto;
import model.Wallet;

public class CryptoController {

    public static void showCryptoMenu() {
    Scanner input = new Scanner(System.in);
    while (true) {
            clearScreen();
        System.out.println("""
                           ------------------------------------------------
                           Selamat datang di Menu Crypto
                           ------------------------------------------------
                           Pilih aset crypto yang ingin kamu beli:
                           1. BTC
                           2. TR Coin
                           3. Horeg Coin
                           4. Fufufafa Coin
                           5. AVS
                           6. RBLX
                           7. Kembali ke Menu Utama
                           ------------------------------------------------
                           Saldo Kamu: Rp.""" + String.format("%,d", Wallet.myWallet.getSaldo()));
        System.out.print("\nKetik Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine(); 

        switch (pilihan) {
            case 1 -> {
System.out.println("BTC");
System.out.println("120k |                         *");
System.out.println("110k |      *          *");
System.out.println("100k |            *         *");
System.out.println(" 90k |   *    *         *");
System.out.println(" 80k |        *   *");
System.out.println(" 70k +-------------------------------------");
System.out.println("");

                System.out.print("Masukkan jumlah pembelian BTC: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.btc.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli BTC sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 2 -> {
                System.out.println("TR Coin");
System.out.println("60k  |                  *     *");
System.out.println("50k  |   *      *");
System.out.println("40k  |          *    *");
System.out.println("30k  |   *              *");
System.out.println("20k  +-------------------------------------");
System.out.println("");

                System.out.print("Masukkan jumlah pembelian TR Coin: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.trCoin.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli TR Coin sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 3 -> {
                System.out.println("Horeg Coin");
System.out.println("15k  |       *     *");
System.out.println("12k  |  *         *    *");
System.out.println("10k  |        *   *");
System.out.println(" 8k  |   *          *");
System.out.println(" 6k  +-------------------------------------");
System.out.println("");

                System.out.print("Masukkan jumlah pembelian Horeg Coin: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.horegCoin.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Horeg Coin sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 4 -> {
                System.out.println("Fufufafa Coin");
System.out.println("200k|       *    *          *");
System.out.println("180k|   *           *");
System.out.println("160k|        *  *");
System.out.println("140k|   *        *    *");
System.out.println("120k+-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah pembelian Fufufafa Coin: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.fufufafaCoin.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Fufufafa Coin sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 5 -> {
                System.out.println("AVS");
System.out.println("80k |   *         *   *");
System.out.println("70k |        *         *");
System.out.println("60k |   *        *");
System.out.println("50k |        *       *");
System.out.println("40k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah pembelian AVS: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.avs.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli AVS sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 6 -> {
                System.out.println("RBLX");
System.out.println("35k |    *     *");
System.out.println("30k |       *        *");
System.out.println("25k |   *        *");
System.out.println("20k |        *       *");
System.out.println("15k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah pembelian RBLX: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Crypto.rblx.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli RBLX sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 7 -> {
                System.out.println("Kembali ke Menu Utama...");
                return;
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
        System.out.println(); 
    }
}
}
