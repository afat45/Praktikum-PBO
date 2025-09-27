package model;

public class Saham {
    private String namaPerusahaan;
    private int hargaPerLembar;
    private int jumlahLembar;
    private int totalInvestasi; // total dana diinvestasikan

    public Saham(String namaPerusahaan, int hargaPerLembar, int jumlahLembar, int totalInvestasi) {
        this.namaPerusahaan = namaPerusahaan;
        this.hargaPerLembar = hargaPerLembar;
        this.jumlahLembar = jumlahLembar;
        this.totalInvestasi = totalInvestasi;
    }

    public String getNamaPerusahaan() { return namaPerusahaan; }
    public int getHargaPerLembar() { return hargaPerLembar; }
    public int getJumlahLembar() { return jumlahLembar; }
    public int getTotalInvestasi() { return totalInvestasi; }

    // tambah investasi
    public void invest(int jumlah) {
        this.totalInvestasi += jumlah;
    }
    
    public static Saham bigMall             = new Saham("Big Mall", 10000, 100, 0);
    public static Saham inforsaGroup        = new Saham("Inforsa Group", 12000, 100,0 );
    public static Saham rizkyJayaRezekiGroup= new Saham("Rizky Jaya Rezeki Group", 8000, 100,0 );
    public static Saham ptKamiManusiaJuga   = new Saham("PT. Kami Manusia Juga", 9000, 100,0);
}
