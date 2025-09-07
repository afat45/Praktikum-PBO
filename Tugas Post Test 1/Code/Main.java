package com.mycompany.manajemen_investasi_keuangan;

// Library
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;

// Main class
public class Main {
    
// Data----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    // saldo
    static long saldo = 0;
    
    // Reksadana 
    static long reksadana_pasar_segiri = 0;
    static long reksadana_pasar_malam = 0;
    static long reksadana_obligasi_dpr = 0;
    
    // Saham
    static long big_mall = 0;
    static long inforsa_group = 0;
    static long rizky_jaya_rezeki_group = 0;
    static long pt_kami_manusia_juga = 0;
    
    // Obligasi
    static long obligasi_fufufafa = 0;
    static long obligasi_prabowo = 0;
    static long obligasi_andre = 0;
    static long obligasi_tanah_samarinda = 0;
    
    // Crypto
    static long btc = 0;
    static long tr_coin = 0;
    static long horeg_coin = 0;
    static long fufufafa_coin = 0;
    static long avs = 0;
    static long rblx = 0;

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
                         7. Log out
                         --------------------------------------------------
                         Ketik Pilihan:  """);
        
        int pilihan = menu.nextInt();
        menu.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Wallet Menu");
                    Wallet();
                }
                case 2 -> {
                    System.out.println("Invesatasi Menu");
                    LocalTime sekarang = LocalTime.now();
                            int jam = sekarang.getHour(); 

                            if (jam >= 5 && jam < 11) {
                                Investasi_Pagi();
                            } 
                            else if (jam >= 11 && jam < 17) {
                                Investasi_Siang();
                            } 
                            else {
                                Investasi_Malam();
                            }
                }
                case 3 -> {
                    System.out.println("Reksadana Menu");
                    Reksadana();
                }
                case 4 -> {
                    System.out.println("Obligasi Menu");
                    Obligasi();
                }
                case 5 -> {
                    System.out.println("Saham Menu");
                    Saham();
                }
                case 6 -> {
                    System.out.println("Crypto Menu");
                    Crypto();
                }
                case 7 -> {
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

// Class untuk wallet-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Wallet() {
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
    System.out.println("Saldo Kamu: Rp." + String.format("%,d", saldo) );
    System.out.println("------------------------------------------------");
    System.out.print("Ketik Pilihan: ");
    
    int pilihan_1 = menu_wallet.nextInt();
    menu_wallet.nextLine(); 
    
        switch (pilihan_1) {
            case 1 -> {
                System.out.print("Masukkan jumlah isi saldo: ");
                long tambah = menu_wallet.nextLong();
                saldo += tambah;
                System.out.println("Saldo berhasil ditambahkan!");
            }
            case 2 -> {
                System.out.print("Masukkan jumlah tarik saldo: ");
                long tarik = menu_wallet.nextLong();
                if (tarik <= saldo) {
                    saldo -= tarik;
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
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", reksadana_pasar_segiri) + " +1,5% " + Kenaikan.get(1));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", reksadana_pasar_malam) + " +0,8% " + Kenaikan.get(2));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", reksadana_obligasi_dpr) + " +0,5% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", big_mall) + " +2,3% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", inforsa_group) + " +1,2% " + Kenaikan.get(1));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", rizky_jaya_rezeki_group) + " -0,8% " + Kenaikan.get(2));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", pt_kami_manusia_juga) + " -1,5% " + Kenaikan.get(3));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", obligasi_fufufafa) + " +0,5% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", obligasi_prabowo) + " +0,7% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", obligasi_andre) + " +0,6% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", obligasi_tanah_samarinda) + " +0,4% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", btc) + " +8,5% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", tr_coin) + " -7,2% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", horeg_coin) + " +5,3% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", fufufafa_coin) + " +9,0% " + Kenaikan.get(0));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", avs) + " -6,8% " + Kenaikan.get(4));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", rblx) + " +7,1% " + Kenaikan.get(0));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", saldo));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);
}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Investasi Siang-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Investasi_Siang() {
    // Array List (Segmen Kenaikan)
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
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", reksadana_pasar_segiri) + " +1,80% " + Kenaikan.get(1));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", reksadana_pasar_malam) + " +0,90% " + Kenaikan.get(2));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", reksadana_obligasi_dpr) + " +0,60% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", big_mall) + " +3,50% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", inforsa_group) + " +0,90% " + Kenaikan.get(1));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", rizky_jaya_rezeki_group) + " -1,10% " + Kenaikan.get(3));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", pt_kami_manusia_juga) + " -0,50% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", obligasi_fufufafa) + " +0,60% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", obligasi_prabowo) + " +0,80% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", obligasi_andre) + " +0,50% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", obligasi_tanah_samarinda) + " +0,40% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", btc) + " +7,50% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", tr_coin) + " -6,20% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", horeg_coin) + " +4,10% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", fufufafa_coin) + " +8,20% " + Kenaikan.get(0));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", avs) + " -5,00% " + Kenaikan.get(4));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", rblx) + " +6,00% " + Kenaikan.get(0));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", saldo));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);

}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Investasi Malam-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Investasi_Malam() {
    // Array List (Segmen Kenaikan)
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
    System.out.println(" - Pasar Segiri           : Rp." + String.format("%,d", reksadana_pasar_segiri) + " +0,80% " + Kenaikan.get(2));
    System.out.println(" - Pasar Malam            : Rp." + String.format("%,d", reksadana_pasar_malam) + " +1,20% " + Kenaikan.get(1));
    System.out.println(" - Obligasi DPR           : Rp." + String.format("%,d", reksadana_obligasi_dpr) + " +0,50% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Saham:");
    System.out.println(" - Big Mall               : Rp." + String.format("%,d", big_mall) + " +1,80% " + Kenaikan.get(1));
    System.out.println(" - Inforsa Group          : Rp." + String.format("%,d", inforsa_group) + " -0,50% " + Kenaikan.get(3));
    System.out.println(" - Rizky Jaya Rezeki Group: Rp." + String.format("%,d", rizky_jaya_rezeki_group) + " +2,20% " + Kenaikan.get(1));
    System.out.println(" - PT. Kami Manusia Juga  : Rp." + String.format("%,d", pt_kami_manusia_juga) + " -1,00% " + Kenaikan.get(3));
    System.out.println("");

    System.out.println("Obligasi:");
    System.out.println(" - Fufufafa               : Rp." + String.format("%,d", obligasi_fufufafa) + " +0,40% " + Kenaikan.get(2));
    System.out.println(" - Prabowo                : Rp." + String.format("%,d", obligasi_prabowo) + " +0,60% " + Kenaikan.get(1));
    System.out.println(" - Andre                  : Rp." + String.format("%,d", obligasi_andre) + " +0,50% " + Kenaikan.get(2));
    System.out.println(" - Tanah Samarinda        : Rp." + String.format("%,d", obligasi_tanah_samarinda) + " +0,30% " + Kenaikan.get(2));
    System.out.println("");

    System.out.println("Crypto:");
    System.out.println(" - BTC                    : Rp." + String.format("%,d", btc) + " +6,80% " + Kenaikan.get(0));
    System.out.println(" - TR Coin                : Rp." + String.format("%,d", tr_coin) + " -5,50% " + Kenaikan.get(4));
    System.out.println(" - Horeg Coin             : Rp." + String.format("%,d", horeg_coin) + " +7,10% " + Kenaikan.get(0));
    System.out.println(" - Fufufafa Coin          : Rp." + String.format("%,d", fufufafa_coin) + " -6,20% " + Kenaikan.get(4));
    System.out.println(" - AVS                    : Rp." + String.format("%,d", avs) + " +5,50% " + Kenaikan.get(0));
    System.out.println(" - RBLX                   : Rp." + String.format("%,d", rblx) + " -4,80% " + Kenaikan.get(4));
    System.out.println("");

    System.out.println("------------------------------------------------");
    System.out.println("Total Saldo Tersedia      : Rp." + String.format("%,d", saldo));
    System.out.println("------------------------------------------------");

    System.out.println("\nTekan ENTER untuk kembali ke Menu Utama...");
    sc.nextLine();

    main(null);

}
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 4 Sub class untuk Investasi
// Reksadana -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Reksadana() {
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
                           Saldo Kamu: Rp.""" + String.format("%,d", saldo));
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    reksadana_pasar_segiri += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    reksadana_pasar_malam += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    reksadana_obligasi_dpr += invest;
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
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Saham -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Saham() {
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
                           Saldo Kamu: Rp.""" + String.format("%,d", saldo));
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    big_mall += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    inforsa_group += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    rizky_jaya_rezeki_group += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    pt_kami_manusia_juga += invest;
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
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Obligasi-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Obligasi() {
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
                           Saldo Kamu: Rp.""" + String.format("%,d", saldo));
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    obligasi_fufufafa += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    obligasi_prabowo += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    obligasi_andre += invest;
                    System.out.println("Transaksi berhasil. Anda membeli Obligasi Andre sebesar Rp." + invest);
                } else {
                    System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
                }
            }
            case 4 -> {
                System.out.print("Masukkan jumlah investasi di Obligasi Tanah Samarinda: Rp.");
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    obligasi_tanah_samarinda += invest;
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
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Crypto-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public static void Crypto() {
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
                           Saldo Kamu: Rp.""" + String.format("%,d", saldo));
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    btc += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    tr_coin += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    horeg_coin += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    fufufafa_coin += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    avs += invest;
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
                long invest = input.nextLong();
                if (invest <= saldo) {
                    saldo -= invest;
                    rblx += invest;
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
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

}