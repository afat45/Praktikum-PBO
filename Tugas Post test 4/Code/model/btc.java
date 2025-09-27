package model;

public class btc extends Crypto {
    private String pembuat;
    private String sales;

    // Constructor Btc
    public btc(String namaToken, int hargaPerKoin, int jumlahKoin, int totalInvestasi, String pembuat, String sales) {
        super(namaToken, hargaPerKoin, jumlahKoin, totalInvestasi); 
        this.pembuat = pembuat;
        this.sales = sales;
    }

    // getter untuk attribute baru 
    public String getPembuat() {
        return pembuat;
    }
    
    public String getsales() {
        return sales;
    }

    // Override untuk memanggil info terusan crypto
    @Override
    public void info() {
        super.info(); // panggil info() dari Crypto
        System.out.println("Pembuat: " + pembuat);
        System.out.println("Sales: " + sales);
    }
}
