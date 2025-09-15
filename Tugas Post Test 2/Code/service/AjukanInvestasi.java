package service;


import static com.mycompany.manajemen_investasi_keuangan.Main.clearScreen;
import java.util.ArrayList;
import java.util.Scanner;
import model.PengajuanInvestasi;

public class AjukanInvestasi {
    private static final ArrayList<PengajuanInvestasi> daftarPengajuan = new ArrayList<>();

    public static void showAjukanInvestasiMenu() {
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
                case 1 -> {
                    System.out.println("Pengajuan Investasi Menu");
                    Create();
                }
                case 2 -> {
                    System.out.println("Menglihat Pengajuan Investasi Menu");
                    Read();
                }
                case 3 -> {
                    System.out.println("Update Pengajuan Investasi Menu");
                    Update();
                }
                case 4 -> {
                    System.out.println("Menghapus Pengajuan Investasi Menu");
                    Delete();
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
    
private static void Create() {
    Scanner sc = new Scanner(System.in);

    clearScreen();
    System.out.println("-------------------------------------------------");
    System.out.println("         Pengajuan Investasi Baru");
    System.out.println("-------------------------------------------------");

    System.out.print("Masukkan Nama Instrumen: ");
    String namaInstrumen = sc.nextLine();

    System.out.print("Masukkan Tipe Instrumen (Reksadana/Saham/Obligasi/Crypto): ");
    String tipeInstrumen = sc.nextLine();

    System.out.print("Masukkan Nilai Investasi (angka): ");
    int nilaiInvestasi = sc.nextInt();
    sc.nextLine(); // buang newline

    System.out.print("Masukkan Nama Pemilik: ");
    String pemilik = sc.nextLine();

    // Buat object PengajuanInvestasi baru
    PengajuanInvestasi pengajuan = new PengajuanInvestasi(
        namaInstrumen, tipeInstrumen, nilaiInvestasi, pemilik
    );

    // Simpan ke list pengajuan
    daftarPengajuan.add(pengajuan);

    System.out.println("\nPengajuan Investasi berhasil dibuat!");
    System.out.println("Nama Instrumen: " + pengajuan.getNamaInstrumen());
    System.out.println("Tipe Instrumen: " + pengajuan.getTipeInstrumen());
    System.out.println("Nilai Investasi: Rp." + pengajuan.getNilaiInvestasi());
    System.out.println("Pemilik: " + pengajuan.getPemilik());

    System.out.println("\nTekan ENTER untuk kembali ke menu...");
    sc.nextLine();
}

private static void Read() {
    Scanner sc = new Scanner(System.in);
    clearScreen();
    System.out.println("-------------------------------------------------");
    System.out.println("         Daftar Pengajuan Investasi");
    System.out.println("-------------------------------------------------");

    if (daftarPengajuan.isEmpty()) {
        System.out.println("Belum ada pengajuan investasi.");
    } else {
        for (int i = 0; i < daftarPengajuan.size(); i++) {
            PengajuanInvestasi p = daftarPengajuan.get(i);
            System.out.println("Pengajuan ke-" + (i + 1));
            System.out.println("Nama Instrumen : " + p.getNamaInstrumen());
            System.out.println("Tipe Instrumen : " + p.getTipeInstrumen());
            System.out.println("Nilai Investasi: Rp." + p.getNilaiInvestasi());
            System.out.println("Pemilik        : " + p.getPemilik());
            System.out.println("--------------------------------------------");
        }
    }

    System.out.println("\nTekan ENTER untuk kembali ke menu...");
    sc.nextLine();
}

private static void Update() {
    Scanner sc = new Scanner(System.in);
    clearScreen();
    System.out.println("-------------------------------------------------");
    System.out.println("         Update Pengajuan Investasi");
    System.out.println("-------------------------------------------------");

    if (daftarPengajuan.isEmpty()) {
        System.out.println("Belum ada pengajuan investasi yang bisa diupdate.");
        System.out.println("\nTekan ENTER untuk kembali...");
        sc.nextLine();
        return;
    }

    // Tampilkan semua pengajuan
    for (int i = 0; i < daftarPengajuan.size(); i++) {
        PengajuanInvestasi p = daftarPengajuan.get(i);
        System.out.println((i + 1) + ". " + p.getNamaInstrumen() + " | " + p.getTipeInstrumen() + " | Rp." + p.getNilaiInvestasi() + " | Pemilik: " + p.getPemilik());
    }

    System.out.print("\nPilih nomor pengajuan yang ingin diupdate: ");
    int pilihan = sc.nextInt();
    sc.nextLine(); // membersihkan buffer

    if (pilihan < 1 || pilihan > daftarPengajuan.size()) {
        System.out.println("Nomor tidak valid!");
        System.out.println("\nTekan ENTER untuk kembali...");
        sc.nextLine();
        return;
    }

    PengajuanInvestasi p = daftarPengajuan.get(pilihan - 1);

    // Input data baru
    System.out.print("Nama Instrumen baru (" + p.getNamaInstrumen() + "): ");
    String namaBaru = sc.nextLine();
    if (!namaBaru.isEmpty()) {
        p.setNamaInstrumen(namaBaru);
    }

    System.out.print("Tipe Instrumen baru (" + p.getTipeInstrumen() + "): ");
    String tipeBaru = sc.nextLine();
    if (!tipeBaru.isEmpty()) {
        p.setTipeInstrumen(tipeBaru);
    }

    System.out.print("Nilai Investasi baru (" + p.getNilaiInvestasi() + "): ");
    String nilaiInput = sc.nextLine();
    if (!nilaiInput.isEmpty()) {
        int nilaiBaru = Integer.parseInt(nilaiInput);
        p.setNilaiInvestasi(nilaiBaru);
    }

    System.out.print("Pemilik baru (" + p.getPemilik() + "): ");
    String pemilikBaru = sc.nextLine();
    if (!pemilikBaru.isEmpty()) {
        p.setPemilik(pemilikBaru);
    }

    System.out.println("\nPengajuan berhasil diupdate!");
    System.out.println("\nTekan ENTER untuk kembali...");
    sc.nextLine();
}

private static void Delete() {
    Scanner sc = new Scanner(System.in);
    clearScreen();
    System.out.println("-------------------------------------------------");
    System.out.println("       Hapus Pengajuan Investasi");
    System.out.println("-------------------------------------------------");

    if (daftarPengajuan.isEmpty()) {
        System.out.println("Belum ada pengajuan investasi yang bisa dihapus.");
        System.out.println("\nTekan ENTER untuk kembali...");
        sc.nextLine();
        return;
    }

    // Tampilkan semua pengajuan
    for (int i = 0; i < daftarPengajuan.size(); i++) {
        PengajuanInvestasi p = daftarPengajuan.get(i);
        System.out.println((i + 1) + ". " + p.getNamaInstrumen() + " | " + p.getTipeInstrumen() + " | Rp." + p.getNilaiInvestasi() + " | Pemilik: " + p.getPemilik());
    }

    System.out.print("\nPilih nomor pengajuan yang ingin dihapus: ");
    int pilihan = sc.nextInt();
    sc.nextLine(); // bersihkan buffer

    if (pilihan < 1 || pilihan > daftarPengajuan.size()) {
        System.out.println("Nomor tidak valid!");
        System.out.println("\nTekan ENTER untuk kembali...");
        sc.nextLine();
        return;
    }

    PengajuanInvestasi removed = daftarPengajuan.remove(pilihan - 1);
    System.out.println("\nPengajuan \"" + removed.getNamaInstrumen() + "\" berhasil dihapus!");
    System.out.println("\nTekan ENTER untuk kembali...");
    sc.nextLine();
}

}
