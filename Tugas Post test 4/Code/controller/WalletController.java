package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
import model.Crypto;
import model.btc;
import model.trcoin;
import model.Wallet; 

public class WalletController {
       
    public static void showWalletMenu() {
        Scanner menu_wallet = new Scanner(System.in);
        
        while (true) {
        try {
        clearScreen();
        System.out.println("""
                           ------------------------------------------------
                           Selamat datang Di Wallet MENU
                           ------------------------------------------------
                           Ada yang bisa Kami bantu?
                           1. Isi Saldo
                           2. Tarik Saldo
                           3. Btc to SaLdo
                           4. Trcoin to SaLdo
                           5. Kembali Ke Menu
                           ------------------------------------------------
                           """);
        System.out.println("Saldo Kamu: Rp." + String.format("%,d", Wallet.myWallet.getSaldo()));
        System.out.println("------------------------------------------------");
        System.out.print("Ketik Pilihan: ");

        int pilihan_1 = menu_wallet.nextInt();
        menu_wallet.nextLine(); 

            switch (pilihan_1) {
                case 1 -> {
                    System.out.print("Masukkan jumlah isi saldo: ");    
                    int tambah = menu_wallet.nextInt();
                    int saldoBaru = Wallet.myWallet.getSaldo() + tambah;
                    Wallet.myWallet = new Wallet(saldoBaru);
                    System.out.println("Saldo berhasil ditambahkan!");
                }
                case 2 -> {
                    System.out.print("Masukkan jumlah tarik saldo: ");
                    int tarik = menu_wallet.nextInt();
                    if (tarik <= Wallet.myWallet.getSaldo()) {
                            int saldoBaru = Wallet.myWallet.getSaldo() - tarik;
                            Wallet.myWallet = new Wallet(saldoBaru);
                        System.out.println("Saldo berhasil ditarik!");} 
                    else {
                        System.out.println("Saldo tidak cukup!");}
                }
                case 3 -> {
                    System.out.println("========== BTC to Saldo ===========");
                        btc bitcoin = new btc("Bitcoin", 650000000, 0, 1300000000, "Satoshi Nakamoto", "Timothy Rolanda");
                        bitcoin.info();
                        System.out.println("===================================");
                        System.out.println("Sisa Btc: Rp." + String.format("%,d", Crypto.btc.getTotalInvestasi()));

                        System.out.print("Masukkan jumlah BTC yang ingin ditarik ke saldo: ");
                        int jumlahTarik = menu_wallet.nextInt();

                        if (jumlahTarik <= Crypto.btc.getTotalInvestasi()) {
                            int nilaiTarik = Crypto.btc.getTotalInvestasi() - jumlahTarik;
                            Crypto.btc.setTotalInvestasi(nilaiTarik);

                            int saldoBaru = Wallet.myWallet.getSaldo() + jumlahTarik;
                            Wallet.myWallet = new Wallet(saldoBaru);
                            
                            System.out.println("==========================================================");
                            System.out.println("Berhasil menarik RP." + String.format("%,d", jumlahTarik));
                            System.out.println("Saldo sekarang: Rp" + String.format("%,d", Wallet.myWallet.getSaldo()));
                            System.out.println("Sisa BTC: Rp." + String.format("%,d", Crypto.btc.getTotalInvestasi()));
                        } else {
                            System.out.println("Gagal! Jumlah BTC tidak mencukupi.");
                            System.out.println("BTC tersedia Rp.: " + String.format("%,d", Crypto.btc.getTotalInvestasi()));
                        }
                }
                case 4 -> {
                    System.out.println("========== Trcoin to Saldo ===========");
                        trcoin Trcoin = new trcoin("trcoin", 650000000, 0, 1300000000, "Timothy Ronaldo", "Gabriel Rey");
                        Trcoin.info();
                        System.out.println("===================================");
                        System.out.println("Sisa trcoin: Rp." + String.format("%,d", Crypto.trCoin.getTotalInvestasi()));

                        System.out.print("Masukkan jumlah trcoin yang ingin ditarik ke saldo: ");
                        int jumlahTarik = menu_wallet.nextInt();

                        if (jumlahTarik <= Crypto.trCoin.getTotalInvestasi()) {
                            int nilaiTarik = Crypto.trCoin.getTotalInvestasi() - jumlahTarik;
                            Crypto.trCoin.setTotalInvestasi(nilaiTarik);

                            int saldoBaru = Wallet.myWallet.getSaldo() + jumlahTarik;
                            Wallet.myWallet = new Wallet(saldoBaru);
                            
                            System.out.println("==========================================================");
                            System.out.println("Berhasil menarik RP." + String.format("%,d", jumlahTarik));
                            System.out.println("Saldo sekarang: Rp" + String.format("%,d", Wallet.myWallet.getSaldo()));
                            System.out.println("Sisa trcoin: Rp." + String.format("%,d", Crypto.trCoin.getTotalInvestasi()));
                        } else {
                            System.out.println("Gagal! Jumlah trcoin tidak mencukupi.");
                            System.out.println("trcoin tersedia Rp.: " + String.format("%,d", Crypto.trCoin.getTotalInvestasi()));
                        }
                }
                case 5 -> {
                    System.out.println("Kembali ke menu utama...");
                    return;
                }
                default -> System.out.println("Pilihan Tidak Valid");
            }
        }
        catch (Exception e) {
        System.out.println("Input tidak valid! Harus angka.");
        menu_wallet.nextLine(); 
        }
            System.out.println("");
        }
}
}