# Najiya-Irawan_Project_individu_PBO
# Projek Individu – Simulasi Bus Trans Koetaradja

Program Berbasis Java (BlueJ)

**1. Deskripsi Program**

Projek ini merupakan simulasi pengelolaan penumpang Bus Trans Koetaradja menggunakan konsep *Object-Oriented Programming (OOP)*. Program memungkinkan pengguna untuk menaikkan penumpang, menurunkan penumpang, serta melihat daftar penumpang yang sedang berada di dalam bus.

Simulasi dibuat berdasarkan aturan operasional bus, termasuk pembagian kursi biasa, kursi prioritas, serta penumpang berdiri ketika kursi sudah penuh.


**2. Fitur Utama**

**Naikkan Penumpang**

* Memasukkan data penumpang (ID, umur, hamil/tidak).
* Mengecek apakah penumpang memenuhi syarat kursi prioritas.
* Memastikan saldo cukup untuk membayar ongkos bus (Rp2000).
* Menempatkan penumpang sesuai aturan:

  * Lansia (>60 tahun), anak-anak (<10 tahun), dan ibu hamil dialokasikan ke kursi prioritas.
  * Penumpang biasa akan duduk di kursi biasa, lalu berdiri jika kursi penuh.
**Turunkan Penumpang**

* Menghapus penumpang dari bus berdasarkan ID.
* Memberi notifikasi apakah penumpang berhasil ditemukan atau tidak.

**Lihat Penumpang**

* Menampilkan daftar:

  * Penumpang Biasa
  * Penumpang Prioritas
  * Penumpang Berdiri
  * Total penumpang
  * Total pendapatan bus


**3. Struktur Kelas**

** Class Penumpang**

Atribut:

* id, umur, hamil, saldo

Method penting:

* Constructor dengan saldo awal 10.000
* tambahSaldo(int)
* kurangiSaldo(int)
* Getter untuk setiap atribut

### Class Bus

Atribut:

* penumpangBiasa[16]
* penumpangPrioritas[4]
* penumpangBerdiri[20]
* ONGKOS_BUS = 2000
* totalPendapatan

Method penting:

* naikkanPenumpang(Penumpang)
* turunkanPenumpang(id)
* Getter jumlah penumpang
* toString() untuk menampilkan ringkasan bus

**Class TestBus**

* Menyediakan menu interaktif:

  * Naikkan Penumpang
  * Turunkan Penumpang
  * Lihat Penumpang


**4. Konsep OOP yang Diimplementasikan**

Program ini menggunakan minimal enam konsep OOP, yaitu:

1. Class dan Object
2. Encapsulation
3. Method dan pemanggilan method
4. Abstraction
5. Polymorphism sederhana (override toString())
6. Array sebagai koleksi data


**5. Cara Menjalankan Program (BlueJ)**

1. Buka BlueJ dan pilih Open Project.
2. Pilih folder projek.
3. Compile seluruh file .java.
4. Jalankan class TestBus.

