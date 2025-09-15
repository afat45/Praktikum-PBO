package model;

public class Wallet {
    
    int saldo;
    
    public static Wallet myWallet = new Wallet(0);
    
    public Wallet(int saldo) {
        this.saldo = saldo;
    }

    // setter untuk ngeset nilai saldo jadi 0
    public void setSaldo() {
        this.saldo = 0;
    }

    // getter biar bisa ambil fungsi saldo
    public int getSaldo() {
        return saldo;
    }
    
    public boolean withdraw(int jumlah) {
    if (jumlah <= saldo) {
        saldo -= jumlah;
        return true;
    } else {
        return false;
    }
    
}
}