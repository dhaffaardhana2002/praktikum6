# Tugas PBO Pertemuan 10

Nama: Muhammad Dhaffa Ardhana Rianto Putra

NIM: 312110029

Kelas: TI.21.C.2

---

Disini saya akan menunjukkan tutorial membuat Abstract Class

## Buat file dan kode Java

- Buat file dengan nama bebas seperti `Utama` dengan ekstensi file `.java`
- Tulis kode java seperti berikut

```
public class Utama {
	public static void main(String[] args) {
	
	}
}
```

### Buat file BangunDatar class

- Untuk membuat super class constructor, buat file di folder yang sama dengan nama `BangunDatar.java`
- Tulis kode java seperti berikut dengan menambahkan `abstract` sebelum `class`

```
public abstract class BangunDatar {
	String warna;
}
```

- Lalu buat Setter dan Getter sebagai berikut

```
public void setWarna(String warna) {
	this.warna = warna;
}

public String getWarna() {
	return this.warna;
}
```

- Setelah itu buat method abstract `gambar()` dan `luas()` dan biarkan kosong

```
public abstract void gambar();
public abstract float luas();
```

Nanti akan diisi pada saat membuat subclass

### Buat file Lingkaran, Segitiga, dan Persegi sebagai subclass dari Pegawai

- Setelah diawal telah membuat super class, sekarang kita akan membuat sub class dengan menggunakan syntac `extend` setelah nama sub class. Karena class BangunDatar sudah menjadi class abstract, subclass tidak perlu menambahkan syntax abstract lagi
- Buat file baru dengan nama `Lingkaran.java` dan ketik kode tersebut


```
public class Lingkaran extends BangunDatar {

}
```

- Lalu buat variabel r, Constructor, gambar() dan luas()


```
public Lingkaran(int r) {
	this.r = r;
}

public void gambar() {
	System.out.println("Menggambar Lingkaran");
}

public float luas() {
	return (float) 3.14 * this.r * this.r;
}
```

- Setelah itu buat file baru dengan nama `Segitiga.java`
- Lalu buat variabel alas dan tinggi, Constructor, gambar() dan luas()

```
public class Segitiga extends BangunDatar {
	int alas;
	int tinggi;

public Segitiga(int alas, int tinggi) {
	this.alas = alas;
	this.tinggi = tinggi;
}

public void gambar() {
	System.out.println("Menggambar Segitiga");
}

public float luas() {
	return this.alas * this.tinggi;
}
```

- Dan yang terakhir, buat file baru dengan nama `Persegi.java`
- Buat variabel panjang dan lebar, Constructor, gambar() dan luas()

```
public class Persegi extends BangunDatar {
	float panjang;
	float lebar;

public Persegi(int panjang, int lebar) {
	this.panjang = panjang;
	this.lebar = lebar;
}

public void gambar() {
	System.out.println("Menggambar Persegi");
}

public float luas() {
	return this.panjang * this.lebar;
}
```

### Di dalam file `Utama.java`

- Tambahkan kode didalam `main()` dengan kode sebagai berikut, untuk menambahkan objek baru dari class constructor yang sudah dibuat dan juga jangan lupa isi datanya sekaligus di dalam Constructor
- Variabel bulat sebagai Lingkaran, atap_rumah sebagai Segitiga dan kotak sebagai Persegi

```
BangunDatar bulat = new Lingkaran(10);
BangunDatar atap_rumah = new Segitiga(7,12);
BangunDatar kotak = new Persegi(10,5);
```

### Cetak hasil koding

- Print hasil dengan menggunakan method `gambar()`

```
bulat.gambar();
atap_rumah.gambar();
kotak.gambar();
```

Lalu print luas dengan `System.out.println()` dan tambahkan method `luas()`

```
System.out.println("\nLuas Lingkaran: " + bulat.luas());
System.out.println("Luas Segitiga: " + atap_rumah.luas());
System.out.println("Luas Persegi: " + kotak.luas());
```

- Save semua file
- Buka cmd (Command Prompt)
- Pergi menuju folder yang sudah dibuat dengan menggunakan `cd ...`
- Lalu eksekusi dengan mengetik `javac` lalu file yang akan di kompile yaitu `Utama.java`, `BangunDatar.java`, `Lingkaran.java`, `Segitiga.java` dan `Persegi.java`.
- Jika berhasil dan tidak ada error, ketik

```
java Utama
```

- Tampilan nya akan seperti ini

```
Menggambar Lingkaran
Menggambar Segitiga
Menggambar Persegi

Luas Lingkaran: 314.0
Luas Segitiga: 84.0
Luas Persegi: 50.0
```

[Klik disini untuk melihat Hasil screenshot](./img.png)

___
Terima kasih telah mengikuti tutorial dari saya, kurang lebihnya mohon maaf.
