package model;

// Subclass yang mengimplementasikan coin crypto rblx
public class RblxCoin extends rblx implements Mining {
    private double harga;

    public RblxCoin(String pembuat, String sales, double harga) {
        super(pembuat, sales);
        this.harga = harga;
    }

    // Overriding abstract method skill()
    @Override
    public void skill() {
        System.out.println("RBXL Coin memiliki fitur Smart Contract dan NFT Marketplace!");
    }

    // Implementasi interface Mining
    @Override
    public void mineCoin() {
        System.out.println("Menambang RBXL Coin... reward 5 RBXL!");
    }

    // Overloading: metode membeli coin dengan variasi parameter
    public void buyCoin(int jumlah) {
        double total = jumlah * harga;
        System.out.println("Membeli " + jumlah + " RBXL dengan harga total $" + total);
    }

    public void buyCoin(int jumlah, double diskon) {
        double total = (jumlah * harga) - diskon;
        System.out.println("Membeli " + jumlah + " RBXL dengan diskon $" + diskon + 
                           ". Total: $" + total);
    }
}
