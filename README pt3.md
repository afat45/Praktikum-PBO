# 📘 Laporan Post Test 3  
**Nama:** Dharma Pala Candra  
**NIM:** 2409116065  

---

## 1. Package
Pada tahap awal post test 3, saya membuat **model baru** bernama `Btc` yang merupakan **turunan (inheritance)** dari model `Crypto`.  

![Package](https://github.com/user-attachments/assets/ccb42bb4-918f-4132-9e2d-ed7021ed8aa0)  

---

## 2. Output
### a. Pembelian BTC  
Setelah melakukan pembelian, nilai BTC berhasil tercatat dengan jumlah sebesar **Rp. 99.999.999**.  

![Pembelian btc](https://github.com/user-attachments/assets/dcb2976b-c464-42d5-a021-481182003259)  

### b. Konversi BTC ke Saldo  
Pada menu **Wallet**, saya menambahkan opsi baru yaitu **“BTC to Saldo”**.  
Fitur ini menunjukkan pemanfaatan **inheritance** dari `Crypto` yang dipanggil menggunakan **override**, serta penerapan logika konversi BTC menjadi saldo.  

![Convert btc ke saldo](https://github.com/user-attachments/assets/b66e9d01-2adf-45f7-bdea-299d8c02844b)  

---

## 3. Code Baru
### a. Model BTC  
Kelas `Btc` dibuat dengan **extends `Crypto`** dan dilengkapi dengan 2 atribut baru beserta getter-nya.  
Selain itu, dilakukan **override** pada method `info()` dari `Crypto` agar menampilkan informasi yang sudah diperbarui di model `Btc`.  

![Model btc](https://github.com/user-attachments/assets/f34e3f17-92ea-4c3a-816d-148f6ff92998)  

### b. Logika Konversi BTC ke Saldo  
Logika konversi ditambahkan pada menu Wallet.  
Di sini, variabel `bitcoin` digunakan untuk memanggil method `info()` yang telah dioverride pada model `Btc`.  

![Logika convert btc ke saldo](https://github.com/user-attachments/assets/e02ac3aa-17ba-478c-8bf6-83dd88e47254)  

---

## 4. Kesimpulan
- Model `Btc` berhasil dibuat sebagai turunan dari `Crypto`.  
- Konsep **inheritance** dan **method overriding** berhasil diterapkan.  
- Fitur baru **BTC to Saldo** dapat dijalankan dengan logika konversi yang telah ditambahkan.  
