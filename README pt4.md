# 📘 Laporan Post Test 4  
**Nama:** Dharma Pala Candra  
**NIM:** 2409116065  
**Mata Kuliah:** Manajemen Investasi Keuangan  

---

## 1. Package
Pada post test 4, terdapat **3 file baru**:  
1. `Mining.java` → **Interface**  
2. `rblx.java` → **Abstract Class**  
3. `RblxCoin.java` → **Class Java biasa**  

![Package](https://github.com/user-attachments/assets/c3e9436e-7716-44e4-a845-8088b1cc3e66)  

---

## 2. Output
### a. Deskripsi Investasi  
Output baru muncul pada menu **Deskripsi Investasi** untuk coin **RBLX**.  
Misal, mengetik `rblx` dan menekan enter akan menampilkan informasi terkait coin tersebut.  

![Output Deskripsi](https://github.com/user-attachments/assets/4631c397-8f9e-4bfe-a36a-c9a7f9db415b)  

### b. Penerapan OOP  
Output berikut menunjukkan penerapan:  
- **Override**  
- **Overloading**  
- **Abstract Class**  
- **Interface**  

![Output OOP](https://github.com/user-attachments/assets/a86d86d2-d1b8-4a97-986f-8a6335dc1f6c)  

---

## 3. Code
### a. Abstract Class `rblx.java`  
File ini berisi **constructor mandiri** untuk coin RBLX serta **method abstract `skill()`** yang merepresentasikan kelebihan coin.  
Method `skill()` akan dioverride di file `RblxCoin.java`. Selain itu, terdapat juga method `info()`.  

![rblx.java](https://github.com/user-attachments/assets/051f7bac-dfb1-4c01-adcf-054b81a6b714)  

### b. Interface `Mining.java`  
Interface ini nantinya akan dioverride di `RblxCoin.java`.  

![Mining.java](https://github.com/user-attachments/assets/f5bdb285-87b9-4a69-8686-7895a5e43fdd)  

### c. Class `RblxCoin.java`  
- Menggunakan **inheritance** dari `rblx.java`  
- Mengimplementasikan **interface `Mining.java`**  
- Terdapat **2 hasil override** dari abstract class dan interface  
- Method `buyCoin()` menggunakan **overloading**, sehingga pembelian bisa opsional memberikan diskon  

![RblxCoin.java](https://github.com/user-attachments/assets/62be3e97-398f-4f13-aeb7-9b0f7577833f)  

### d. DeskripsiInvestasi.java  
Semua method dipanggil pada file ini, memungkinkan menampilkan semua logika pemrograman yang berjalan di latar belakang.  
Terdapat **search khusus untuk crypto RBLX**, yang hanya dapat memanggil method dari 3 file baru tersebut.  

![DeskripsiInvestasi.java](https://github.com/user-attachments/assets/85ce91b0-d158-4b19-958d-52950ec00c76)  

---

## 4. Kesimpulan
- **Abstract class**, **interface**, **inheritance**, **override**, dan **overloading** berhasil diterapkan.  
- Semua fitur coin **RBLX** berjalan sesuai logika yang telah dibuat.  
- **Polymorphism** dan **Abstraction** sudah dapat dijalankan dengan baik sesuai ketentuan post test 4.  
