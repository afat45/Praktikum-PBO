package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PengajuanInvestasi implements IntPengajuanInvestasi {
    
    private int id;
    private String namaInstrumen;
    private String tipeInstrumen; // Reksadana, Saham, Obligasi, Crypto, dll
    private int nilaiInvestasi;   // jumlah yang diajukan
    private String pemilik;

    public PengajuanInvestasi(String namaInstrumen, String tipeInstrumen, int nilaiInvestasi,String pemilik) {
        this.namaInstrumen = namaInstrumen;
        this.tipeInstrumen = tipeInstrumen;
        this.nilaiInvestasi = nilaiInvestasi;
        this.pemilik = pemilik;
    }

    public PengajuanInvestasi() {} // Untuk read jika tanpa data 

    // Getter untuk 5 atrribute
    public int getId() {
        return id;
    }
    
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
    
    @Override
    public void create() {
        String sql = "INSERT INTO pengajuan_investasi (namaInstrumen, tipeInstrumen, nilaiInvestasi ,pemilik) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabasePengajuanInvestasi.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, getNamaInstrumen());
            ps.setString(2, getTipeInstrumen());
            ps.setInt(3, getNilaiInvestasi());
            ps.setString(4, getPemilik());
            ps.executeUpdate();

            System.out.println("Data buku berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("❌Gagal menambah data: " + e.getMessage());
        }
    }

    @Override
    public void read() {
        String sql = "SELECT * FROM pengajuan_investasi";
        try (Connection conn = DatabasePengajuanInvestasi.connect(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n=== DAFTAR PENGAJUAN INVESTASI ===");
            System.out.println("ID | Nama Instrumen | Tipe | Nilai | Pemilik");
            System.out.println("----------------------------------------------");
            
            while (rs.next()) {
                System.out.printf("%d | %s | %s | %d | %s%n",
                        rs.getInt("id"),
                        rs.getString("namaInstrumen"),
                        rs.getString("tipeInstrumen"),
                        rs.getInt("nilaiInvestasi"),
                        rs.getString("pemilik")
                );
            }
        } catch (Exception e) {
            System.out.println("Gagal membaca data: " + e.getMessage());
        }
    }

    @Override
    public void update(int id) {
        String sql = "UPDATE pengajuan_investasi SET namaInstrumen=?, tipeInstrumen=?, nilaiInvestasi=?, pemilik=? WHERE id=?";
        try (Connection conn = DatabasePengajuanInvestasi.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, getNamaInstrumen());
            ps.setString(2, getTipeInstrumen());
            ps.setInt(3, getNilaiInvestasi());
            ps.setString(4, getPemilik());
            ps.setInt(5, id);
            ps.executeUpdate();

            System.out.println("Data Pengajuan Investasi berhasil diperbarui!");
        } catch (Exception e) {
            System.out.println("Gagal update data: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM pengajuan_investasi WHERE id=?";
        try (Connection conn = DatabasePengajuanInvestasi.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Data Pengajuan Investasi berhasil dihapus!");
        } catch (Exception e) {
            System.out.println("Gagal hapus data: " + e.getMessage());
        }
    }
}
