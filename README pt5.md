Nama: Dharma Pala Candra\
NIM: 2409116065

Manajemen Investasi Keuangan

1.Package
<img width="617" height="917" alt="Screenshot 2025-10-08 011415" src="https://github.com/user-attachments/assets/aea052f0-6fed-4561-93a0-e2a23a649b1d" />
Dipackage terbaru ini terlihat 2 libraries atau extension java yang baru , libraries tersebut di gunakan untuk menyambungkan data ke mysql.  terdapat juga  2 class baru yaitu IntPengajuanInvestasi.java dan DatabasePengajuanInvestasi.java , interface digunakan untuk override pada program crud dan database sebagai konfigurasi utama yang berkaitan dengan database mysql.

2. Database
<img width="752" height="431" alt="Screenshot 2025-10-07 233007" src="https://github.com/user-attachments/assets/c6d682b5-aab7-4d0b-816e-fcdb82d89077" />
Disini merupakan dokumentasi table database yang ada di mysql dengan 20 baris data.
<img width="1008" height="816" alt="Screenshot 2025-10-08 010136" src="https://github.com/user-attachments/assets/25550075-a487-4199-b047-df9631b4ff71" />
Ini merupakan dokumentasi table database yang ada di phpmyadmin.

3. Output
<img width="562" height="296" alt="Screenshot 2025-10-08 010119" src="https://github.com/user-attachments/assets/90d4378b-d60b-4b39-854f-164858238bc0" />
Hal yang saya ubah disini adalah program crud pada Pengajuan Investasi
<img width="763" height="738" alt="Screenshot 2025-10-08 010126" src="https://github.com/user-attachments/assets/d7dd0bf9-6522-4ea6-ba9b-d99b9164d3aa" />
Pertama ada menu create yang berfungsi untuk menambahkan sebuah data dengan id baru pada sebuah database
<img width="1008" height="816" alt="Screenshot 2025-10-08 010136" src="https://github.com/user-attachments/assets/43a286a9-7b48-4049-91bb-612f423a1e36" />
berikut dokumentasinya setelah di cretae di netbeans dan ditampilkan pada phpmyadmin, yang artiynya koneksi dari netbeans dan mysql berjalan lancar.
<img width="731" height="871" alt="Screenshot 2025-10-08 010152" src="https://github.com/user-attachments/assets/21f09e50-a573-44e9-a567-fa09a3dc0e8c" />
lalu di sini ada fungsi read pada program crud yang menampilkan data yang sama pada mysql.
<img width="742" height="826" alt="Screenshot 2025-10-08 010936" src="https://github.com/user-attachments/assets/8a9c1f02-a172-41b1-a579-fea4d0b4444d" />
berikut merupakan contoh update dengan memasukan id serta hal yang diperbarui. contoh di sini id 11
<img width="527" height="29" alt="Screenshot 2025-10-08 010945" src="https://github.com/user-attachments/assets/585740a3-90f6-4e6a-aad1-f0a0cff9d34f" />
berikut hasilnya setelah di update.
<img width="746" height="735" alt="Screenshot 2025-10-08 011025" src="https://github.com/user-attachments/assets/836487fa-3c03-4cd6-804e-f16f1523489d" />
lalu ada program dlelete dengan memasukan idnya , lalu data nya akan terhapus.
<img width="783" height="662" alt="Screenshot 2025-10-08 011037" src="https://github.com/user-attachments/assets/3b59c742-e3fd-48e8-ab08-95ab7c1b2530" />
beriktu dokumentasinya setelah terdelete

4. Code
<img width="596" height="254" alt="Screenshot 2025-10-08 005834" src="https://github.com/user-attachments/assets/a14806cf-bdde-4a02-91a1-fbf73591595e" />
pertama disini saya membuat sebuah interface baru khusus program crud pada pengajuan investasi yang nantinyaakan di override di modelnya
<img width="1775" height="930" alt="Screenshot 2025-10-08 005905" src="https://github.com/user-attachments/assets/d78c8c67-6e45-4f1c-b5ac-4d0098dd48b5" />
berikut hasil overridenya pada model pengajuaninvestasinya
<img width="977" height="782" alt="Screenshot 2025-10-08 005842" src="https://github.com/user-attachments/assets/6976bc1b-b9be-474d-b508-f96cb592e6c3" />
Ini merupakan database pengajuan investasi , disini merupakan konfigurasi utama untuk menyambungkan ke database di mysql , pastikan DB_NAME sama dengan database yang dituju.
<img width="1080" height="923" alt="Screenshot 2025-10-08 005917" src="https://github.com/user-attachments/assets/da9854e5-eec6-4edd-bb50-65769f3a570c" />
berikut merupakan contoh pemanggilan dari program crudnya , yang seperti biasa ada penerapan crudnya.
