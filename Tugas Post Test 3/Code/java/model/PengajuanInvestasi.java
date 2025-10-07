package model;

public class PengajuanInvestasi {

    private String namaInstrumen;
    private String tipeInstrumen; // Reksadana, Saham, Obligasi, Crypto, dll
    private int nilaiInvestasi;   // jumlah yang diajukan
    private String pemilik;

    // Constructor
    public PengajuanInvestasi(String namaInstrumen, String tipeInstrumen, int nilaiInvestasi,String pemilik) {
        this.namaInstrumen = namaInstrumen;
        this.tipeInstrumen = tipeInstrumen;
        this.nilaiInvestasi = nilaiInvestasi;
        this.pemilik = pemilik;
    }

    // Getter untuk 4 atrribute
    public String getNamaInstrumen() {
        return namaInstrumen;
    }

    public String getTipeInstrumen() {
        return tipeInstrumen;
    }
    
    public int  getNilaiInvestasi() {
        return nilaiInvestasi;
    }

    public String getPemilik() {
        return pemilik;
    }

    // Setter untuk 4 atrribute
    public void setNamaInstrumen(String namaInstrumen) {
        this.namaInstrumen = namaInstrumen;
    }

    public void setTipeInstrumen(String tipeInstrumen) {
        this.tipeInstrumen = tipeInstrumen;
    }

    public void setNilaiInvestasi(int nilaiInvestasi) {
        this.nilaiInvestasi = nilaiInvestasi;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
}
