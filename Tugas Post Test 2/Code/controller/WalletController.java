package controller;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.Scanner;
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
                           3. Kembali Ke Menu
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