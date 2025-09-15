# Manajemen Investasi Keuangan

**Nama:** Dharma Pala Candra  
**NIM:** 2409116065  

---

## Struktur Project

<img width="622" height="677" alt="Screenshot 2025-09-16 001256" src="https://github.com/user-attachments/assets/c836a5a8-43c4-4e19-b6b6-1962ed3e648b" />

Project ini menggunakan **empat package utama**:

1. **`main`**  
   File utama yang menjalankan program.  

2. **`controller`**  
   Mengatur logika transaksi dari setiap instrument investasi.  

3. **`model`**  
   Berfokus pada data tiap instrument investasi, memanfaatkan **properties**, **constructor**, dan **access modifier**.  

4. **`service`**  
   Menerapkan **CRUD penuh** serta fitur tambahan untuk memenuhi ketentuan post test 2.
   
---

<img width="564" height="466" alt="Struktur Class" src="https://github.com/user-attachments/assets/23f7e159-fd43-49b9-96b1-d4e9227b8581" />

## Menu Baru (Post Test 1)

Terdapat **dua menu baru**:

1. **Deskripsi Investasi**  
2. **Ajukan Investasi Baru**

---

<img width="531" height="193" alt="Menu Baru" src="https://github.com/user-attachments/assets/28a8adbe-e7a4-4681-a866-ee9c4de02a30" />

## Deskripsi Instrument

Sebelum menggunakan fitur search, terdapat dua opsi:  

1. Search (Nilai Tambah)
2. Kembali ke menu utama

<img width="666" height="566" alt="Menu Deskripsi Investasi" src="https://github.com/user-attachments/assets/ca96b2a6-29cc-4c2a-b7c3-5c7899737566" />

### Contoh Search

Misalnya mencari deskripsi **BTC**, input kata-kata yang berhubungan sudah bisa digunakan, **tidak sensitif kapital**.

<img width="568" height="165" alt="Search BTC" src="https://github.com/user-attachments/assets/5201d8df-43ae-4a43-a4b6-83c28e3c3ada" />

### Hasil Output

Menampilkan deskripsi dari instrumen yang dicari. Tekan ENTER untuk kembali ke menu **Deskripsi Investasi**.

---

## Ajukan Investasi Baru

<img width="530" height="272" alt="Hasil Search BTC" src="https://github.com/user-attachments/assets/ebfc7698-9215-460e-b8cf-518822a86dbc" />

Menu ini memiliki **5 opsi**, dengan 4 opsi CRUD:

### Dokumentasi Fitur

<img width="722" height="381" alt="Menu Ajukan Investasi" src="https://github.com/user-attachments/assets/56d8acf7-667e-4d3b-acef-58058ca7954f" />


1. **Create**: Pengajuan investasi baru

<img width="591" height="296" alt="Create" src="https://github.com/user-attachments/assets/f639c011-cf01-4b54-ab1f-beabe9d5cbaf" />

2. **Read**: Melihat pengajuan investasi

<img width="580" height="375" alt="Read" src="https://github.com/user-attachments/assets/2f8883e7-b82f-40fb-a900-970d4fdb4179" />

3. **Update**: Mengubah pengajuan investasi

<img width="562" height="280" alt="Update" src="https://github.com/user-attachments/assets/28ae2428-30c5-41a4-a3ca-144743bde4a8" />

4. **Delete**: Menghapus pengajuan investasi
---
## Penjelasan Code

<img width="790" height="877" alt="Delete" src="https://github.com/user-attachments/assets/de4f88ae-5e66-402c-bed8-b6b27e3ccd8e" />

## Contoh Class `Wallet`

- Wallet di **model** memiliki properti saldo dengan tipe **integer**, diinisialisasi awal **0**.  
- **Setter** digunakan untuk mengubah nilai saldo dari class lain.  
- **Getter** digunakan untuk mengambil nilai saldo untuk keperluan class lain.  
- **Withdraw** digunakan di package controller untuk menghitung pengurangan saldo.

---

<img width="1289" height="842" alt="Class Wallet" src="https://github.com/user-attachments/assets/5214dd24-5076-4180-8f98-f8c8ba19b3af" />

## Contoh Class `Reksadana`

- Constructor sudah dideklarasikan.  
- Getter digunakan untuk keperluan class lain yang berhubungan dengan **Reksadana**.  
- `public void invest` digunakan untuk menambahkan nilai investasi dari package controller.  
- Setter bisa digunakan sebagai template untuk keperluan class lain atau modifikasi data.

---

> Semua menu dan class sudah didesain agar **CRUD**, **deskripsi**, dan transaksi investasi dapat dijalankan dengan baik sesuai ketentuan post test.
