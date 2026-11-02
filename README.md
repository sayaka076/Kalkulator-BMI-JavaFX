# Kalkulator BMI (Body Mass Index) - JavaFX

Aplikasi desktop sederhana berbasis **JavaFX**, **Maven**, dan **Scene Builder (FXML)** untuk menghitung Indeks Massa Tubuh (*Body Mass Index* / BMI) serta menentukan kategori berat badan ideal. Aplikasi ini dirancang dengan antarmuka satu layar (*single-scene*) minimalis bernuansa gradasi merah dan hitam.

---

## Fitur Utama
* **Antarmuka Single-Scene Minimalis:** Desain modern dengan tema *dark mode* gradasi merah-hitam.
* **Perhitungan Otomatis & Akurat:** Mengonversi satuan tinggi badan (cm ke meter) dan menghitung skor BMI dengan presisi satu angka desimal.
* **Indikator Warna Kategori:** Warna teks kategori berubah secara dinamis sesuai hasil perhitungan BMI.
* **Validasi Input:** Mencegah *error* apabila kolom kosong, bernilai nol/negatif, atau diisi dengan karakter selain angka (mendukung penggunaan titik `.` maupun koma `,` untuk angka desimal).
* **Penyimpanan Sementara (In-Memory):** Pemrosesan langsung di memori tanpa memerlukan konfigurasi *database* tambahan.

---

## Teknologi yang Digunakan
* **Bahasa Pemrograman:** Java (JDK 17+)
* **Framework UI:** JavaFX 21 (`javafx-controls`, `javafx-fxml`)
* **Desain Layout:** JavaFX Scene Builder (`.fxml`)
* **Build Tool:** Apache Maven

---

## Cara Menggunakan Aplikasi

1. **Masukkan Tinggi Badan:**
   Ketikkan tinggi badan Anda dalam satuan **sentimeter (cm)** pada kolom **Tinggi Badan (cm)** (contoh: `170` atau `168.5`).
2. **Masukkan Berat Badan:**
   Ketikkan berat badan Anda dalam satuan **kilogram (kg)** pada kolom **Berat Badan (kg)** (contoh: `65` atau `60.5`).
3. **Hitung Skor BMI:**
   Klik tombol **HITUNG BMI**. Aplikasi akan langsung menampilkan:
   * **Skor BMI Anda** berupa angka pada panel bagian bawah.
   * **Status Kategori Berat Badan** beserta warna indikatornya.
4. **Menghitung Ulang (Reset):**
   Klik tombol **RESET** untuk mengosongkan seluruh kolom input dan mengembalikan tampilan skor ke kondisi awal.

<img width="1260" height="717" alt="image" src="https://github.com/user-attachments/assets/808b0d68-ce25-45e7-9a42-d3b7e4f880ac" />
