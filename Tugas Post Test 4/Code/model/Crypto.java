package model;

public class Crypto {
    private String namaToken;
    private int hargaPerKoin;
    private int jumlahKoin;
    private int totalInvestasi; // total dana diinvestasikan

    public Crypto(String namaToken, int hargaPerKoin, int jumlahKoin, int totalInvestasi) {
        this.namaToken = namaToken;
        this.hargaPerKoin = hargaPerKoin;
        this.jumlahKoin = jumlahKoin;
        this.totalInvestasi = totalInvestasi;
    }

    public String getNamaToken() { return namaToken; }
    public int getHargaPerKoin() { return hargaPerKoin; }
    public int getJumlahKoin() { return jumlahKoin; }
    public int getTotalInvestasi() { return totalInvestasi; }

    // tambah investasi
    public void invest(int jumlah) {
        this.totalInvestasi += jumlah;
    }
    
    // Mengganti isi investasi
    public void setTotalInvestasi(int totalInvestasi) {
        this.totalInvestasi = totalInvestasi;
    }
    
    public void info() {
        System.out.println("Token: " + namaToken);
        System.out.println("Harga per koin: " + hargaPerKoin);
        System.out.println("Jumlah koin: " + jumlahKoin);
        System.out.println("Total investasi: " + totalInvestasi);
    }
    
    public static Crypto btc                 = new Crypto("BTC", 15000000, 0, 0);
    public static Crypto trCoin              = new Crypto("TR Coin", 5000, 10, 0);
    public static Crypto horegCoin           = new Crypto("Horeg Coin", 3000, 10, 0);
    public static Crypto fufufafaCoin        = new Crypto("Fufufafa Coin", 10000, 5, 0);
    public static Crypto avs                 = new Crypto("AVS", 2000, 20, 0);
    public static Crypto rblx                = new Crypto("RBLX", 7000, 8, 0);
}

