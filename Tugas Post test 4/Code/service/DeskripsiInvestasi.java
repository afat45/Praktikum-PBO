package service;

import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import static com.mycompany.manajemen_investasi_keuangan.Main.main;
import java.util.Scanner;
import model.Crypto;
import model.Saham;
import model.Reksadana;
import model.Obligasi;
import model.RblxCoin;


public class DeskripsiInvestasi {

    public static void menuDeskripsi() {
        clearScreen();
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("        Menu Deskripsi Instrumen Investasi      ");
        System.out.println("------------------------------------------------");
        System.out.println("1. Search Instrumen Investasi");
        System.out.println("2. Kembali ke Menu Utama");
        System.out.println("------------------------------------------------");
        System.out.print("Pilih menu: ");
        
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                searchInstrumen(sc);
                break;
            case "2":
                main(null);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.out.println("Tekan ENTER untuk kembali...");
                sc.nextLine();
                menuDeskripsi();
                break;
        }
    }

    private static void searchInstrumen(Scanner sc) {
        clearScreen();
        
        System.out.println("=== Daftar Instrumen Investasi yang Bisa Dicari ===");
        System.out.println("Reksadana:");
        System.out.println(" - Pasar Segiri");
        System.out.println(" - Pasar Malam");
        System.out.println(" - Obligasi DPR");

        System.out.println("Saham:");
        System.out.println(" - Big Mall");
        System.out.println(" - Inforsa Group");
        System.out.println(" - Rizky Jaya Rezeki Group");
        System.out.println(" - PT. Kami Manusia Juga");

        System.out.println("Obligasi:");
        System.out.println(" - Fufufafa");
        System.out.println(" - Prabowo");
        System.out.println(" - Andre");
        System.out.println(" - Tanah Samarinda");

        System.out.println("Crypto:");
        System.out.println(" - BTC");
        System.out.println(" - TR Coin");
        System.out.println(" - Horeg Coin");
        System.out.println(" - Fufufafa Coin");
        System.out.println(" - AVS");
        System.out.println(" - RBLX");
        System.out.print("Masukkan nama instrumen: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;

        // Reksadana
        Reksadana[] reksadanas = {Reksadana.pasarSegiri, Reksadana.pasarMalam, Reksadana.obligasiDPR};
        for (Reksadana r : reksadanas) {
            if (r.getNamaProduk().toLowerCase().contains(keyword)) {
                System.out.println("Reksadana: " + r.getNamaProduk());
                System.out.println("Risk Level: " + r.getRiskLevel());
                System.out.println("Jumlah Unit: " + r.getJumlahUnit());
                System.out.println("---------------------------");
                found = true;
            }
        }

        // Saham
        Saham[] sahams = {Saham.bigMall, Saham.inforsaGroup, Saham.rizkyJayaRezekiGroup, Saham.ptKamiManusiaJuga};
        for (Saham s : sahams) {
            if (s.getNamaPerusahaan().toLowerCase().contains(keyword)) {
                System.out.println("Saham: " + s.getNamaPerusahaan());
                System.out.println("Harga per Lembar: Rp." + s.getHargaPerLembar());
                System.out.println("Jumlah Lembar: " + s.getJumlahLembar());
                System.out.println("---------------------------");
                found = true;
            }
        }

        // Obligasi
        Obligasi[] obligasis = {Obligasi.fufufafa, Obligasi.prabowo, Obligasi.andre, Obligasi.tanahSamarinda};
        for (Obligasi o : obligasis) {
            if (o.getNamaObligasi().toLowerCase().contains(keyword)) {
                System.out.println("Obligasi: " + o.getNamaObligasi());
                System.out.println("Bunga Tahunan: " + o.getBungaTahunan() + "%");
                System.out.println("Jumlah Unit: " + o.getJumlahUnit());
                System.out.println("---------------------------");
                found = true;
            }
        }

        // Crypto
        Crypto[] cryptos = {Crypto.btc, Crypto.trCoin, Crypto.horegCoin, Crypto.fufufafaCoin, Crypto.avs,};
        for (Crypto c : cryptos) {
            if (c.getNamaToken().toLowerCase().contains(keyword)) {
                System.out.println("Crypto: " + c.getNamaToken());
                System.out.println("Harga per Koin: Rp." + c.getHargaPerKoin());
                System.out.println("Jumlah Koin: " + c.getJumlahKoin());
                System.out.println("---------------------------");
                found = true;
            }
        }
        Crypto[] cryptorblx = {Crypto.rblx};
        for (Crypto b : cryptorblx) {
                RblxCoin coin = new RblxCoin("Dharma Candra", "Global Sales", 2.5);
                
                System.out.println("\n==============================================");
                coin.info();

                coin.skill();
 
                coin.mineCoin();

                coin.buyCoin(10);              // beli tanpa diskon
                coin.buyCoin(20, 5.0);         // beli dengan diskon
                System.out.println("\n==============================================");
                found = true;
            }

        if (!found) {
            System.out.println("Instrumen tidak ditemukan!");
        }

        System.out.println("\nTekan ENTER untuk kembali ke Menu Deskripsi...");
        sc.nextLine();
        menuDeskripsi();
    }
}

