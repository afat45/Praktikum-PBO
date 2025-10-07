# 📘 Laporan Post Test 5  
**Nama:** Dharma Pala Candra  
**NIM:** 2409116065  
**Mata Kuliah:** Manajemen Investasi Keuangan  

---

## 1. Package
Pada package terbaru ini terdapat **dua libraries atau extension Java baru** yang digunakan untuk **menghubungkan data dengan MySQL**.  
Selain itu, terdapat **dua class tambahan**, yaitu:  

1. `IntPengajuanInvestasi.java` → Interface yang digunakan untuk **override** dalam program CRUD.  
2. `DatabasePengajuanInvestasi.java` → Class sebagai **konfigurasi utama** yang mengatur koneksi ke database MySQL.  

![Package](https://github.com/user-attachments/assets/aea052f0-6fed-4561-93a0-e2a23a649b1d)  

---

## 2. Database
### a. Struktur Database di MySQL  
Gambar berikut menunjukkan dokumentasi tabel database yang ada di MySQL, berisi **20 baris data**:  

![Database MySQL](https://github.com/user-attachments/assets/c6d682b5-aab7-4d0b-816e-fcdb82d89077)  

### b. Database di PhpMyAdmin  
Berikut merupakan dokumentasi tabel database yang terlihat di **PhpMyAdmin**:  

![Database PhpMyAdmin](https://github.com/user-attachments/assets/25550075-a487-4199-b047-df9631b4ff71)  

---

## 3. Output
### Perubahan Program  
Perubahan utama dilakukan pada **program CRUD Pengajuan Investasi**.  

![CRUD Program](https://github.com/user-attachments/assets/90d4378b-d60b-4b39-854f-164858238bc0)  

### a. Create Data  
Menu **Create** digunakan untuk menambahkan data baru dengan ID otomatis pada database.  

![Create Data](https://github.com/user-attachments/assets/d7dd0bf9-6522-4ea6-ba9b-d99b9164d3aa)  

Berikut dokumentasi hasil **penambahan data** di NetBeans dan tampilannya pada PhpMyAdmin, yang menunjukkan bahwa **koneksi NetBeans dengan MySQL berjalan lancar**:  

![Create Result](https://github.com/user-attachments/assets/43a286a9-7b48-4049-91bb-612f423a1e36)  

### b. Read Data  
Fungsi **Read** digunakan untuk menampilkan seluruh data yang tersimpan pada database.  

![Read Data](https://github.com/user-attachments/assets/21f09e50-a573-44e9-a567-fa09a3dc0e8c)  

### c. Update Data  
Fungsi **Update** digunakan untuk memperbarui data berdasarkan ID yang dimasukkan.  
Contoh berikut memperbarui data dengan **ID 11**:  

![Update Form](https://github.com/user-attachments/assets/8a9c1f02-a172-41b1-a579-fea4d0b4444d)  

Berikut hasilnya setelah proses update berhasil dijalankan:  

![Update Result](https://github.com/user-attachments/assets/585740a3-90f6-4e6a-aad1-f0a0cff9d34f)  

### d. Delete Data  
Fungsi **Delete** digunakan untuk menghapus data berdasarkan ID yang dimasukkan.  

![Delete Form](https://github.com/user-attachments/assets/836487fa-3c03-4cd6-804e-f16f1523489d)  

Berikut hasil dokumentasi setelah data berhasil dihapus dari database:  

![Delete Result](https://github.com/user-attachments/assets/3b59c742-e3fd-48e8-ab08-95ab7c1b2530)  

---

## 4. Code
### a. Interface `IntPengajuanInvestasi.java`  
Interface ini dibuat khusus untuk program CRUD pada Pengajuan Investasi dan akan dioverride pada model utama.  

![Interface CRUD](https://github.com/user-attachments/assets/a14806cf-bdde-4a02-91a1-fbf73591595e)  

### b. Override CRUD di Model  
Berikut hasil penerapan (override) dari interface CRUD pada model `PengajuanInvestasi.java`:  

![Override Model](https://github.com/user-attachments/assets/d78c8c67-6e45-4f1c-b5ac-4d0098dd48b5)  

### c. Konfigurasi Database  
`DatabasePengajuanInvestasi.java` berfungsi sebagai **penghubung utama** antara aplikasi dan database MySQL.  
Pastikan nilai `DB_NAME` sesuai dengan nama database yang digunakan.  

![Database Config](https://github.com/user-attachments/assets/6976bc1b-b9be-474d-b508-f96cb592e6c3)  

### d. Pemanggilan CRUD  
Berikut merupakan contoh **pemanggilan fungsi CRUD** yang menunjukkan seluruh logika program berjalan dengan baik:  

![CRUD Call](https://github.com/user-attachments/assets/da9854e5-eec6-4edd-bb50-65769f3a570c)  

---

## 5. Kesimpulan
- Program berhasil **terhubung ke database MySQL** menggunakan konfigurasi Java Database Connectivity (JDBC).  
- Semua operasi **CRUD (Create, Read, Update, Delete)** berjalan dengan baik.  
- Interface dan override berhasil diterapkan untuk memisahkan logika program dari struktur database.  
- Semua menu dan class sudah didesain agar **CRUD**, **deskripsi**, dan **transaksi investasi** dapat dijalankan dengan baik sesuai ketentuan **Post Test 5**.  
