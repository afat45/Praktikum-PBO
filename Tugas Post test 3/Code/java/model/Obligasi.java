package model;

public class Obligasi {
    private String namaObligasi;
    private double bungaTahunan;
    private int jumlahUnit;
    private int totalInvestasi; // total dana diinvestasikan

    public Obligasi(String namaObligasi, double bungaTahunan, int jumlahUnit, int totalInvestasi) {
        this.namaObligasi = namaObligasi;
        this.bungaTahunan = bungaTahunan;
        this.jumlahUnit = jumlahUnit;
        this.totalInvestasi = totalInvestasi;
    }

    public String getNamaObligasi() { return namaObligasi; }
    public double getBungaTahunan() { return bungaTahunan; }
    public int getJumlahUnit() { return jumlahUnit; }
    public int getTotalInvestasi() { return totalInvestasi; }

    // tambah investasi
    public void invest(int jumlah) {
        this.totalInvestasi += jumlah;
    }
    
    public static Obligasi fufufafa          = new Obligasi("Fufufafa", 0.5, 100, 0);
    public static Obligasi prabowo           = new Obligasi("Prabowo", 0.7, 100, 0);
    public static Obligasi andre             = new Obligasi("Andre", 0.6, 100, 0);
    public static Obligasi tanahSamarinda    = new Obligasi("Tanah Samarinda", 0.4, 100, 0);
}
