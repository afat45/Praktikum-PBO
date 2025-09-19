package com.mycompany.manajemen_investasi_keuangan;

// Library
import java.util.Scanner;
import service.*;
import controller.*;
import java.time.LocalTime;

// Main class
public class Main {
    
// Main Menu-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {  
        Scanner menu = new Scanner(System.in);
        while (true) {
            try{ 
        clearScreen();
        System.out.print("""
                         -------------------------------------------------
                         Selamat datang di 
                         
                         PR ARCO 
                         
                         Platfrom Terbaik Investasi NO 1 Di Indonesia
                         -------------------------------------------------
                         Ada yang bisa kami bantu?
                         1. Wallet
                         2. Investasi
                         3. Reksadana
                         4. Obligasi
                         5. Saham
                         6. Crypto
                         7. Deskripsi Investasi
                         8. Ajukan Investasi Baru
                         9. Log out
                         --------------------------------------------------
                         Ketik Pilihan:  """);
        
        int pilihan = menu.nextInt();
        menu.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Wallet Menu");
                    WalletController.showWalletMenu();
                }
                case 2 -> {
                    System.out.println("Invesatasi Menu");
                    LocalTime sekarang = LocalTime.now();
                            int jam = sekarang.getHour(); 

                            if (jam >= 5 && jam < 11) {
                                investasi.Investasi_Pagi();
                            } 
                            else if (jam >= 11 && jam < 17) {
                                investasi.Investasi_Siang();
                            } 
                            else {
                                investasi.Investasi_Malam();
                            }
                }
                case 3 -> {
                    System.out.println("Reksadana Menu");
                    ReksadanaController.showReksadanaMenu();
                }
                case 4 -> {
                    System.out.println("Obligasi Menu");
                    ObligasiController.showObligasiMenu();
                }
                case 5 -> {
                    System.out.println("Saham Menu");
                    SahamController.showSahamMenu();
                }
                case 6 -> {
                    System.out.println("Crypto Menu");
                    CryptoController.showCryptoMenu();
                }
                case 7 -> {
                    System.out.println("Deskripsi Investasi");
                    DeskripsiInvestasi.menuDeskripsi();
                }
                case 8 -> {
                    System.out.println("Ajukan Investasi Baru");
                    AjukanInvestasi.showAjukanInvestasiMenu();
                }
                case 9 -> {
                    System.out.println("Sampai Jumpa Lagi!");
                    menu.close();
                    System.exit(0); 
                }
                default -> System.out.println("Pilihan tidak valid!");
            }

    }
    catch (Exception e) {
    System.out.println("Input tidak valid! Harus angka.");
    menu.nextLine(); 
    }
                    System.out.println("");
    }
}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
// Clear Screen-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void clearScreen() {
    for (int i = 0; i < 30; i++) {
        System.out.println();
    }
}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}