# 📚 Dokumentasi Tugas Praktikum PBO

Repositori ini berisi kumpulan tugas, *screenshot*, dan laporan dari setiap pertemuan praktikum mata kuliah Pemrograman Berorientasi Objek.

---

## 📌 Pertemuan 1 (P01): Halo Java

Berikut adalah lampiran hasil eksekusi program (screenshot) untuk pertemuan pertama:

**1. Output Halo PBO**
![Output Halo PBO](Screenshot-P01/outputhalopbo.png)

**2. Output Kartu Mahasiswa**
![Output Kartu Mahasiswa](Screenshot-P01/output_kartumahasiswa.png)

**3. Bukti Commit**
![Output Commit](Screenshot-P01/output_commit.png)

---

## 📌 Pertemuan 2 (P02): Perpustakaan Mini

**📝 Laporan Praktikum:**
[Klik di sini untuk membaca Laporan Eksperimen P02](Screenshot-dan-Laporan-P02/EksperimenP02.txt)

**📸 Bukti Hasil Eksekusi Program (Screenshot):**
![Output Perpustakaan Mini](Screenshot-dan-Laporan-P02/output_perpustakanmini.png)

---

## 📌 Pertemuan 3 (P03): Komponen GUI

**📝 Laporan Praktikum (Pertanyaan Refleksi):**
[Klik di sini untuk membaca Pertanyaan Refleksi P03](Screenshot-dan-Laporan-P03/PertanyaanRefleksi_P03.txt)

**📸 Bukti Hasil Eksekusi Program (Screenshot):**

**1. Desain Form**
![Desain Form](Screenshot-dan-Laporan-P03/design_P03.png)

**2. Output Mode Terang**
![Output Mode Terang](Screenshot-dan-Laporan-P03/mode_terang.png)

**3. Output Mode Gelap**
![Output Mode Gelap](Screenshot-dan-Laporan-P03/mode_gelap.png)

---

## 📌 Pertemuan 4 (P04): Form Lanjutan & Saling Menilai 

**📝 Laporan & Refleksi:**
* **Eksperimen P04:** [KLIK INI untuk membaca jawaban Eksperimen P04](Screenshot-dan-Laporan-P04/EksperimenP04.txt)
* **Pertanyaan Refleksi P04:** [Baca Pertanyaan Refleksi P04](Screenshot-dan-Laporan-P04/PertanyaanRefleksi_P04.txt)

**Deklarasi Penggunaan AI:**
Saya menggunakan alat AI (Google Gemini & chatgpt) sebagai asisten untuk membantu memahami pesan error pada kode program Java dan membantu merapikan komponen yang terlihat salah, serta untuk merapikan struktur dan format markdown pada dokumentasi file `README.md` ini.

**🎨 Sketsa & Rancangan:**
**1. Sketsa**
![Sketsa P04](Screenshot-dan-Laporan-P04/sketsa.jpeg)

**2. Tabel Rancangan**
| Bagian | Panel | Layout |
| :--- | :--- | :--- |
| Jendela | JFrame | BorderLayout |
| Header | headerPanel | BoxLayout, Y Axis |
| Isi form | isiPanel / formPanel | BorderLayout / GridBagLayout |
| Tombol | tombolPanel | FlowLayout, Right |

**📋 Tabel Penilaian / Saling Menilai (dinilai oleh Nuriatun Syalma):**
![Tabel Penilaian P04](Screenshot-dan-Laporan-P04/tabel_penilaian.jpg)

**📸 Bukti Hasil Eksekusi Program (Screenshot):**

**1. Desain Form P04**
![Desain P04](Screenshot-dan-Laporan-P04/design_P04.png)

**2. Form Ukuran Awal**
![Form Ukuran Awal](Screenshot-dan-Laporan-P04/form_ukuranAwal.png)

**3. Form Saat Dilebarkan**
![Form Dilebarkan](Screenshot-dan-Laporan-P04/form_dilebarkan.png)

---

## 📌 Pertemuan 5 (P05): Event Handling

**📝 Laporan Praktikum:**
[Klik di sini untuk membaca Laporan Eksperimen P05](Screenshot-dan-Laporan-P05/EksperimenP05.txt)

**Deklarasi Penggunaan AI:**
Saya menggunakan alat AI (Google Gemini) sebagai asisten untuk membantu memahami konsep event handler, menangani pesan error/typo pada kode Java, serta membantu merapikan penulisan struktur dan format markdown pada dokumentasi file `README.md` ini.

**📋 Tabel Pengamatan Praktikum (Pengamat Event)**

| No | Tindakan | Event yang tercatat |
| :--- | :--- | :--- |
| 1 | Arahkan kursor ke tombol, lalu jauhkan | `MouseEvent` kursor masuk ke tombol, kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | `MouseEvent` kursor masuk ke tombol, `ActionEvent` tombol diklik, kursor keluar dari tombol |
| 3 | Centang lalu hapus centang Aktifkan fitur | `ItemEvent` kotak dicentang, kotak tidak dicentang |
| 4 | Ganti pilihan dari Pagi menjadi Malam | `ItemEvent` memilih Malam |
| 5 | Klik isian, lalu ketik kata "abc" | `FocusEvent` isian mendapat fokus, `KeyEvent` mengetik huruf a, mengetik huruf b, mengetik huruf c |
| 6 | Klik tombol setelah mengetik di isian | `FocusEvent` isian kehilangan fokus, `MouseEvent` kursor masuk ke tombol, `ActionEvent` tombol diklik |

**🗺️ Peta Event Form Anggota Perpustakaan:**

| Komponen | Menu Events | Aksi |
| :--- | :--- | :--- |
| Kotak centang setuju (`setujuCheck`) | Item -> itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal (`batalButton`) | Action -> actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar (`daftarButton`) | Action -> actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM (`npmField`) | Key -> keyReleased | Label kecil menampilkan jumlah digit NPM |
| Form (`FormAnggotaPerpustakaan` di Navigator) | Window -> windowClosing | Minta konfirmasi sebelum aplikasi ditutup |

**📸 Bukti Hasil Eksekusi Program (Screenshot):**

**1. Properties Events Tombol Daftar**
![Properties Events Tombol Daftar](Screenshot-dan-Laporan-P05/events_daftar.png)

**2. Dialog Ringkasan Data**
![Dialog Ringkasan](Screenshot-dan-Laporan-P05/layardialog_ringkasan.png)

**3. Dialog Konfirmasi Keluar**
![Dialog Konfirmasi Keluar](Screenshot-dan-Laporan-P05/layardialog_keluar.png)

---

## 📌 Pertemuan 6 (P06): Validasi Input

**📝 Eksperimen:**
1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?
- Jawaban: Huruf yang diketik tidak akan muncul atau masuk ke dalam kolom NPM (diabaikan). Baris kode yang menyebabkannya adalah `evt.consume();` di dalam method `npmFieldKeyTyped`, yang dipicu oleh kondisi jika karakter yang dimasukkan bukan digit angka (`!Character.isDigit(evt.getKeyChar())`) atau jika panjang teks sudah mencapai batas maksimal 10 digit.
2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?
- Jawaban: Pesan kesalahan (beserta garis merah) langsung muncul pada event `focusLost` ketika pengguna selesai mengetik dan berpindah fokus (menekan tombol Tab atau mengklik area lain) keluar dari kolom email, selama isi teks tidak kosong.

3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?
- Jawaban: Karena pemeriksaan langsung (*immediate feedback*) menggunakan *event* `focusLost` diberi pengecekan kondisi `!textField.getText().isBlank()`. Kolom yang kosong dilewati saat pindah isian agar pengguna tidak langsung diteror pesan merah sebelum selesai mengisi form; isian kosong baru akan diperiksa secara menyeluruh saat tombol "Daftar" diklik.

4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?
- Jawaban: Isian pertama yang mengalami kesalahan validasi, yaitu kolom **NPM** (`npmField`), karena method `salah.get(0).requestFocusInWindow()` mengarahkan kursor otomatis ke elemen pertama di dalam daftar antrean kesalahan.

5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?
- Jawaban: Fokus berpindah ke kolom **Nama Lengkap** (`namaLengkapField`). Properti yang mengaturnya adalah `displayedMnemonic` yang diset bernilai `'N'` pada label `namaLengkapLabel` yang dihubungkan dengan properti `labelFor`.

6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?
- Jawaban: Ya, data tetap ada dan tidak terhapus. Kondisi `if (jawab != JOptionPane.YES_OPTION) return;` memastikan bahwa proses pengosongan form dibatalkan apabila pengguna memilih tombol 'No' pada dialog konfirmasi.

**📝 Deklarasi Penggunaan AI:**
- Alat AI yang dipakai: Gemini (Google)- Keperluan: Membantu proses debugging error pada kode Java Swing (FlatLaf), merapikan struktur method validasi, serta menyusun format jawaban eksperimen praktikum.
