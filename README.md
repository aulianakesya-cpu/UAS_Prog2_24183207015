# UAS_Prog2_24183207015
UAS Pemrograman 2

# Sistem Manajemen Akademik (Java OOP)
Sistem Manajemen Akademik sederhana berbasis console yang dibangun menggunakan bahasa pemrograman Java. Proyek ini mendemonstrasikan penerapan pilar-pilar utama Object-Oriented Programming (OOP) seperti Inheritance, Abstraction, Polymorphism, dan Encapsulation.



# 📌 Fitur Utama

◉ Manajemen User: Input dan simpan data Mahasiswa serta Dosen ke dalam satu list yang sama (Polymorphism).

◉ Manajemen Mata Kuliah: Menambahkan data mata kuliah yang tersedia.

◉ Sistem Penilaian: Menghitung nilai akhir mahasiswa berdasarkan bobot:
   Tugas (30%)
   UTS (30%)
   UAS (40%)

◉Pelacakan Statis: Menghitung total mahasiswa yang terdaftar secara otomatis menggunakan static counter.

◉ Error Handling: Validasi input menu untuk mencegah crash jika pengguna memasukkan karakter non-angka.



# 🏗️ Struktur OOP & Class Diagram
Proyek ini menggunakan struktur kelas yang saling berhubungan sebagai berikut:

**Deskripsi Komponen:**

◉ User.java (Abstract Class): Kelas induk yang menyimpan properti umum (id, nama).

◉ Mahasiswa.java & Dosen.java (Inheritance): Turunan dari kelas User dengan atribut spesifik masing-masing.

◉ Penilaian.java (Interface): Kontrak untuk perhitungan nilai.

◉ Nilai.java (Implementation): Mengimplementasikan logika perhitungan nilai akhir.

◉ MataKuliah.java: Kelas entitas untuk mengelola data mata kuliah.

◉ MainClass.java: Driver utama aplikasi yang menangani alur logika dan interaksi pengguna.



# 📋 Contoh Penggunaan
Setelah menjalankan aplikasi, Anda akan melihat menu utama:

===SISTEM AKADEMIK===
1. Input Data Mahasiswa
2. Input Data Dosen
3. Input Mata Kuliah
4. Input Nilai Mahasiswa
5. Tampilkan Data
0. Keluar
