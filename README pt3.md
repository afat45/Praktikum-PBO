# 📘 Laporan Post Test 3  
**Nama:** Dharma Pala Candra  
**NIM:** 2409116065  

---

## 1. Package
Pada tahap awal post test 3, saya membuat **model baru** bernama `Btc` dan `Trcoin` yang merupakan **turunan (inheritance)** dari model `Crypto`.  

![Package](https://github.com/user-attachments/assets/fd6d7721-d498-4301-a73b-c1a1e8895ba4)  

---

## 2. Output
### a. Pembelian BTC  
Setelah melakukan pembelian, nilai BTC berhasil tercatat dengan jumlah sebesar **Rp. 99.999.999**.  

![Pembelian btc](https://github.com/user-attachments/assets/dcb2976b-c464-42d5-a021-481182003259)  

### b. Konversi BTC ke Saldo  
Pada menu **Wallet**, saya menambahkan opsi baru yaitu **“BTC to Saldo”** dan **“Trcoin to Saldo”**.  
Fitur ini menunjukkan pemanfaatan **inheritance** dari `Crypto` yang dipanggil menggunakan **override**, serta penerapan logika konversi BTC dan Trcoin menjadi saldo.  

![Convert btc ke saldo](https://github.com/user-attachments/assets/32c876e1-6cd9-4b69-96f4-cbbc8f755abb)  

---

## 3. Code Baru
### a. Model BTC dan Trcoin 
Kelas `Btc` dibuat dengan **extends `Crypto`** dan dilengkapi dengan 2 atribut baru beserta getter-nya, Begitu juga dengan model Trcoin.  
Selain itu, dilakukan **override** pada method `info()` dari `Crypto` agar menampilkan informasi yang sudah diperbarui di model `Btc`.  

![Model btc](https://github.com/user-attachments/assets/f34e3f17-92ea-4c3a-816d-148f6ff92998)  

### b. Logika Konversi BTC ke Saldo  
Logika konversi ditambahkan pada menu Wallet.  
Di sini, variabel `bitcoin` digunakan untuk memanggil method `info()` yang telah dioverride pada model `Btc`.  

![Logika convert btc ke saldo](https://github.com/user-attachments/assets/e02ac3aa-17ba-478c-8bf6-83dd88e47254)  

### c. Penerapan Setter dan Getter (Pengajuan Investasi)  
Pada bagian ini diterapkan **getter dan setter** dari model `Pengajuan Investasi`.  
Getter digunakan untuk **mengambil nilai** dari model tersebut, sedangkan setter digunakan untuk **mengganti nilai** di kelas lain yang membutuhkan akses terhadap data investasi.  

![Penerapan setter dan getter Pengajuan Investasi](https://github.com/user-attachments/assets/d676ccec-9e4d-45a2-9ec8-d11d94d0bf82)  

---

## 4. Kesimpulan
- Model `Btc` dan `Trcoin` berhasil dibuat sebagai turunan dari `Crypto`.  
- Konsep **inheritance** dan **method overriding** berhasil diterapkan.  
- Fitur baru **BTC to Saldo** dan **Trcoin to Saldo** dapat dijalankan dengan logika konversi yang telah ditambahkan.  
- Penerapan **getter dan setter** memungkinkan pengelolaan data `Pengajuan Investasi` secara lebih fleksibel dan terstruktur.  
