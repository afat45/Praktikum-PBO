package service;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import static com.mycompany.manajemen_investasi_keuangan.Main.main;
import java.util.ArrayList;
import java.util.Scanner;
import model.Wallet;
import model.Crypto;
import model.Saham;
import model.Reksadana;
import model.Obligasi;

public class investasi {
// Class untuk Investasi-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    
// Investasi Pagi-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Investasi_Pagi() {
    // Array List (Segmen Kenaikan)
    ArrayList<String> Kenaikan = new ArrayList<>();
    Kenaikan.add("Naik Tinggi (+30%)");   // 0
    Kenaikan.add("Naik (+5%)");          // 1
    Kenaikan.add("Stabil (-5%~+5%)");    // 2
    Kenaikan.add("Turun (-5%)");         // 3
    Kenaikan.add("Turun Drastis (-30%)");// 4

    clearScreen();
    Scanner sc = new Scanner(System.in);
    System.out.println("""
                       ------------------------------------------------
                       Portofolio Investasi Kamu
                       ------------------------------------------------
                       """);
    System.out.println("Waktu sekarang: " + java.time.LocalTime.now());

    System.out.println("Reksadana:");
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", Reksadana.pasarSegiri.getTotalInvestasi()) + " +1,5% " + Kenaikan.get(1));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", Reksadana.pasarMalam.getTotalInvestasi()) + " +0,8% " + Kenaikan.get(2));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", Reksadana.obligasiDPR.getTotalInvestasi()) + " +0,5% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", Saham.bigMall.getTotalInvestasi()) + " +2,3% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", Saham.inforsaGroup.getTotalInvestasi()) + " +1,2% " + Kenaikan.get(1));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", Saham.rizkyJayaRezekiGroup.getTotalInvestasi()) + " -0,8% " + Kenaikan.get(2));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", Saham.ptKamiManusiaJuga.getTotalInvestasi()) + " -1,5% " + Kenaikan.get(3));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", Obligasi.fufufafa.getTotalInvestasi()) + " +0,5% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", Obligasi.prabowo.getTotalInvestasi()) + " +0,7% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", Obligasi.andre.getTotalInvestasi()) + " +0,6% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", Obligasi.tanahSamarinda.getTotalInvestasi()) + " +0,4% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", Crypto.btc.getTotalInvestasi()) + " +8,5% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", Crypto.trCoin.getTotalInvestasi()) + " -7,2% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", Crypto.horegCoin.getTotalInvestasi()) + " +5,3% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", Crypto.fufufafaCoin.getTotalInvestasi()) + " +9,0% " + Kenaikan.get(0));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", Crypto.avs.getTotalInvestasi()) + " -6,8% " + Kenaikan.get(4));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", Crypto.rblx.getTotalInvestasi()) + " +7,1% " + Kenaikan.get(0));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", Wallet.myWallet.getSaldo()));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);
}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Investasi Siang-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Investasi_Siang() {
    ArrayList<String> Kenaikan = new ArrayList<>();
    Kenaikan.add("Naik Tinggi");   // 0
    Kenaikan.add("Naik");          // 1
    Kenaikan.add("Stabil");        // 2
    Kenaikan.add("Turun");         // 3
    Kenaikan.add("Turun Drastis");// 4

    clearScreen();
    Scanner sc = new Scanner(System.in);
    System.out.println("""
                       ------------------------------------------------
                       Portofolio Investasi Kamu
                       ------------------------------------------------
                       """);
    System.out.println("Waktu sekarang: " + java.time.LocalTime.now());

    System.out.println("Reksadana:");
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", Reksadana.pasarSegiri.getTotalInvestasi()) + " +1,80% " + Kenaikan.get(1));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", Reksadana.pasarMalam.getTotalInvestasi()) + " +0,90% " + Kenaikan.get(2));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", Reksadana.obligasiDPR.getTotalInvestasi()) + " +0,60% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", Saham.bigMall.getTotalInvestasi()) + " +3,50% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", Saham.inforsaGroup.getTotalInvestasi()) + " +0,90% " + Kenaikan.get(1));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", Saham.rizkyJayaRezekiGroup.getTotalInvestasi()) + " -1,10% " + Kenaikan.get(3));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", Saham.ptKamiManusiaJuga.getTotalInvestasi()) + " -0,50% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", Obligasi.fufufafa.getTotalInvestasi()) + " +0,60% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", Obligasi.prabowo.getTotalInvestasi()) + " +0,80% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", Obligasi.andre.getTotalInvestasi()) + " +0,50% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", Obligasi.tanahSamarinda.getTotalInvestasi()) + " +0,40% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", Crypto.btc.getTotalInvestasi()) + " +7,50% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", Crypto.trCoin.getTotalInvestasi()) + " -6,20% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", Crypto.horegCoin.getTotalInvestasi()) + " +4,10% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", Crypto.fufufafaCoin.getTotalInvestasi()) + " +8,20% " + Kenaikan.get(0));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", Crypto.avs.getTotalInvestasi()) + " -5,00% " + Kenaikan.get(4));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", Crypto.rblx.getTotalInvestasi()) + " +6,00% " + Kenaikan.get(0));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", Wallet.myWallet.getSaldo()));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);
}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Investasi Malam-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Investasi_Malam() {
    ArrayList<String> Kenaikan = new ArrayList<>();
    Kenaikan.add("Naik Tinggi");   // 0
    Kenaikan.add("Naik");          // 1
    Kenaikan.add("Stabil");        // 2
    Kenaikan.add("Turun");         // 3
    Kenaikan.add("Turun Drastis");// 4

    clearScreen();
    Scanner sc = new Scanner(System.in);
    System.out.println("""
                       ------------------------------------------------
                       Portofolio Investasi Kamu
                       ------------------------------------------------
                       """);
    System.out.println("Waktu sekarang: " + java.time.LocalTime.now());

    System.out.println("Reksadana:");
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", Reksadana.pasarSegiri.getTotalInvestasi()) + " +0,80% " + Kenaikan.get(2));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", Reksadana.pasarMalam.getTotalInvestasi()) + " +1,20% " + Kenaikan.get(1));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", Reksadana.obligasiDPR.getTotalInvestasi()) + " +0,50% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", Saham.bigMall.getTotalInvestasi()) + " +1,80% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", Saham.inforsaGroup.getTotalInvestasi()) + " -0,50% " + Kenaikan.get(3));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", Saham.rizkyJayaRezekiGroup.getTotalInvestasi()) + " +2,20% " + Kenaikan.get(1));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", Saham.ptKamiManusiaJuga.getTotalInvestasi()) + " -1,00% " + Kenaikan.get(3));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", Obligasi.fufufafa.getTotalInvestasi()) + " +0,40% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", Obligasi.prabowo.getTotalInvestasi()) + " +0,60% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", Obligasi.andre.getTotalInvestasi()) + " +0,50% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", Obligasi.tanahSamarinda.getTotalInvestasi()) + " +0,30% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", Crypto.btc.getTotalInvestasi()) + " +6,80% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", Crypto.trCoin.getTotalInvestasi()) + " -5,50% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", Crypto.horegCoin.getTotalInvestasi()) + " +7,10% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", Crypto.fufufafaCoin.getTotalInvestasi()) + " -6,20% " + Kenaikan.get(4));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", Crypto.avs.getTotalInvestasi()) + " +5,50% " + Kenaikan.get(0));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", Crypto.rblx.getTotalInvestasi()) + " -4,80% " + Kenaikan.get(4));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", Wallet.myWallet.getSaldo()));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);
}
// ---------------------------------------------------------------------------------------------------------------------------------------------------------

}
