package model;

public class Reksadana {
    private String namaProduk;
    private String riskLevel;
    private int jumlahUnit;
    private int totalInvestasi; // tambahan untuk simpan dana yang diinvestasikan

    public Reksadana(String namaProduk, String riskLevel, int jumlahUnit, int totalInvestasi) {
        this.namaProduk = namaProduk;
        this.riskLevel = riskLevel;
        this.jumlahUnit = jumlahUnit;
        this.totalInvestasi = totalInvestasi;
    }

    public String getNamaProduk() { return namaProduk; }
    public String getRiskLevel() { return riskLevel; }
    public int getJumlahUnit() { return jumlahUnit; }
    public int getTotalInvestasi() { return totalInvestasi; }

    // method untuk menambah investasi
    public void invest(int jumlah) {
        this.totalInvestasi += jumlah;
    }
    
    public static Reksadana pasarSegiri = new Reksadana("Pasar Segiri", "Low Risk", 100, 0);
    public static Reksadana pasarMalam = new Reksadana("Pasar Malam", "Medium Risk", 200, 0);
    public static Reksadana obligasiDPR = new Reksadana("Obligasi DPR", "High Risk", 300, 0);
}
