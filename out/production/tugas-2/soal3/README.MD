# Soal 3 - Get Middle Characters

## Ketentuan

**Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:**

1. Mengubah kode fungsi `main()` yang berada di dalam file `Soal3Main.kt`
2. Menghapus atau mengubah nama fungsi dan variable yang sudah ada di dalam file `Soal3.kt`
3. Membuat fungsi baru yang bukan merupakan tugas latihan
4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)

## Instruksi Latihan

Untuk mengerjakan soal latihan ini, silakan buka file `Soal3.kt`.

### TODO

Sesuaikan fungsi `getMiddleCharacters()` dengan ketentuan sebagai berikut:

- Menerima input `String` dengan panjang karakter 1-100.
- Mengembalikan satu atau dua karakter paling tengah dari `String` yang diinput.
    - Jika panjang `String` bernilai **genap**, yang dikembalikan adalah `2` karakter.
    - Jika panjang `String` bernilai **ganjil**, yang dikembalikan adalah `1` karakter.

#### Contoh 1:

- Masukan: `string` = `telkom`
- Keluaran: `lk`
- Penjelasan:
    - Panjang teks `telkom` adalah 6 karakter (genap). Karakter paling tengah adalah `lk`.

#### Contoh 2:

- Masukan: `string` = `motionlab`
- Keluaran: `o`
- Penjelasan:
    - Panjang teks `motionlab` adalah 9 karakter (ganjil). Karakter paling tengah adalah `o`.

## Menguji Kode

Untuk menguji kode, silakan jalankan fungsi `main` pada file `Soal3Main.kt`.

Jika kode pada `Soal3.kt` sudah diperbaiki sesuai ketentuan, maka keluarannya akan seperti berikut:

```
true
true
true
```