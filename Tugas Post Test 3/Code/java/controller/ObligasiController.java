package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
import model.Obligasi;
import model.Wallet;

public class ObligasiController {

    public static void showObligasiMenu() {
    Scanner input = new Scanner(System.in);

    while (true) {
            clearScreen();
        System.out.println("""
                           ------------------------------------------------
                           Selamat datang di Menu Obligasi
                           ------------------------------------------------
                           Pilih obligasi yang ingin kamu beli:
                           1. Obligasi Fufufafa
                           2. Obligasi Prabowo
                           3. Obligasi Andre
                           4. Obligasi Tanah Samarinda
                           5. Kembali ke Menu Utama
                           ------------------------------------------------
                           Saldo Kamu: Rp.""" + String.format("%,d", Wallet.myWallet.getSaldo()));
        System.out.print("\nKetik Pilihan: ");

        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.println("Obligasi Fufufafa");
System.out.println("100k|   *      *      *");
System.out.println(" 95k|   *      *      *");
System.out.println(" 90k|   *      *      *");
System.out.println(" 85k+-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Obligasi Fufufafa: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Obligasi.fufufafa.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Obligasi Fufufafa sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 2 -> {
                System.out.println("Obligasi Prabowo");
System.out.println("80k |   *   *   *");
System.out.println("75k |   *   *   *");
System.out.println("70k |   *   *   *");
System.out.println("65k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Obligasi Prabowo: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Obligasi.prabowo.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Obligasi Prabowo sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 3 -> {
                System.out.println("Obligasi Andre");
System.out.println("70k |   *   *   *");
System.out.println("65k |   *   *   *");
System.out.println("60k |   *   *   *");
System.out.println("55k +-------------------------------------");
System.out.println("");
                System.out.print("Masukkan jumlah investasi di Obligasi Andre: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Obligasi.andre.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Obligasi Andre sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 4 -> {
                System.out.print("Masukkan jumlah investasi di Obligasi Tanah Samarinda: Rp.");
                int invest = input.nextInt();
                if (invest <= Wallet.myWallet.getSaldo()) {
                    Wallet.myWallet.withdraw(invest);
                    Obligasi.tanahSamarinda.invest(invest);
                    System.out.println("Transaksi berhasil. Anda membeli Obligasi Tanah Samarinda sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 5 -> {
                System.out.println("Kembali ke Menu Utama...");
                return;
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
        System.out.println();
    }
}
}
