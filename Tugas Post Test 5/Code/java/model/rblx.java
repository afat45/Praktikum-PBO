package model;

// Abstraction: Abstract class
public abstract class rblx {
    protected String pembuat;
    protected String sales;

    public rblx(String pembuat, String sales) {
        this.pembuat = pembuat;
        this.sales = sales;
    }

    // Method abstract → wajib dioverride oleh subclass
    public abstract void skill();

    // Method biasa
    public void info() {
        System.out.println("Pembuat: " + pembuat );
        System.out.println("Sales Coin: " + sales);
    }
}

