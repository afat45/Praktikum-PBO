package service;

import java.util.Scanner;
import java.sql.SQLException;
import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import model.DatabasePengajuanInvestasi;
import model.PengajuanInvestasi;

public class AjukanInvestasi {

    public static void showAjukanInvestasiMenu() {
        PengajuanInvestasi investasi = new PengajuanInvestasi();
        
        Scanner menu = new Scanner(System.in);
        while (true) {
            try{ 
        clearScreen();
        System.out.print("""
                         -------------------------------------------------
                         Selamat datang di Menu Ajukan Investasi
                         -------------------------------------------------
                         Ada yang bisa kami bantu?
                         1. Pengajuan Investasi (Create)
                         2. Menglihat Pengajuan Investasi (Read)
                         3. Update Pengajuan Investasi (Update)
                         4. Menghapus Pengajuan Investasi (Delete)
                         5. Kembali Ke Menu Main
                         --------------------------------------------------
                         Ketik Pilihan:  """);
        
        int pilihan = menu.nextInt();
        menu.nextLine(); 

            switch (pilihan) {
                case 1 -> { // Create
                    System.out.println("Pengajuan Investasi Menu");
                    investasi.read();
                    System.out.println("\n== Tambah Data ==");
                    System.out.print("Nama Instrumen: ");
                    String nama = menu.nextLine();
                    System.out.print("Tipe Instrumen: ");
                    String tipe = menu.nextLine();
                    System.out.print("Nilai Investasi: ");
                    int nilai = menu.nextInt(); menu.nextLine();
                    System.out.print("Pemilik: ");
                    String pemilik = menu.nextLine();

                    PengajuanInvestasi baru = new PengajuanInvestasi(nama, tipe, nilai, pemilik);
                    baru.create();
                }
                case 2 -> { // Read
                    System.out.println("Menglihat Pengajuan Investasi Menu");
                    investasi.read();
                }
                case 3 -> { // Update
                    System.out.println("Update Pengajuan Investasi Menu");
                    investasi.read();
                    System.out.print("Masukkan ID yang ingin diupdate: ");
                    int id = menu.nextInt(); menu.nextLine();

                    System.out.print("Nama Instrument Baru: ");
                    String nama = menu.nextLine();
                    System.out.print("Tipe Instrument Baru: ");
                    String tipe = menu.nextLine();
                    System.out.print("Nilai Investasi Baru: ");
                    int nilai = menu.nextInt(); menu.nextLine();
                    System.out.print("Pemilik Baru: ");
                    String pemilik = menu.nextLine();

                    PengajuanInvestasi updateData = new PengajuanInvestasi(nama, tipe, nilai, pemilik);
                    updateData.update(id);
                }
                case 4 -> { // Delete
                    System.out.println("Menghapus Pengajuan Investasi Menu");
                    investasi.read();
                    System.out.print("Masukkan ID yang ingin dihapus: ");
                    int id = menu.nextInt();
                    menu.nextLine();
                    investasi.delete(id);
                }
                case 5 -> {
                    System.out.println("Kembali Ke Menu Utama....");
                    return;
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


}
