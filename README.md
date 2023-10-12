<H1>LAPORAN POST TEST 2</H1>
<H1>PEMROGRAMAN BERORIENTASI OBJEK</H1>
<H2>Program CRUD Sederhana Pizza Hut Dengan Java Language</H2>

Disusun Oleh:
**Muhammad Irfan Maulana** - 2209116036

<h1>BAB 1

LATAR BELAKANG</h1>


<h3>Deskripsi Program</h3>

Pizza Hut adalah salah satu rantai restoran yang menyajikan berbagai jenis hidangan pizza. Untuk mengelola data pelanggan, pesanan, dan menu, perlu ada sistem yang efisien. Oleh karena itu saya terinspirasi untuk mengambil tema menggunakan Pizza Hut.

Tujuan utama dari proyek ini adalah membuat aplikasi yang memungkinkan Pizza Hut untuk mengelola data pelanggan, pesanan, dan menu secara efisien. Program ini akan memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data pelanggan, pesanan, dan menu restoran.

<H1>BAB 2

PENJELASAN SOURCECODE DAN OUTPUT PROGRAM</H1>

<H2>PENJELASAN SOURCECODE LINE</H2>

<H3>Pizzahut.java</H3>

*Line 1-3*
```java
package com.pizzahut;
import java.util.Scanner;
import pizzahutClass.MenuManager;
```
Package com.pizzahut adalah pendeklarasian sebuah package atau sederhananya sebuah folder bernama com.pizzahut yang memuat baris kode utama milik class utama Pizzahut.java.

*line 6-9*
```java
public class Pizzahut {
    public final static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        Scanner scanner = new Scanner(System.in);
```

Kode ini mendefinisikan sebuah kelas bernama Pizzahut. Kata kunci public menunjukkan bahwa kelas ini dapat diakses dari luar package di mana kelas ini berada. Nama kelas adalah "Pizzahut," dan tanda kurung kurawal { menandai awal dari blok kode kelas.

public final static void main adalah deklarasi metode main. Dalam bahasa Java, setiap program yang dijalankan memerlukan metode main sebagai titik awal eksekusi. 

MenuManager menuManager = new MenuManager adalah deklarasi dan inisialisasi objek dari kelas MenuManager. Dalam baris ini, Anda membuat sebuah objek menuManager yang merupakan contoh dari kelas MenuManager.

Scanner scanner = new Scanner adalah deklarasi dan inisialisasi objek Scanner. Dalam baris ini, Anda membuat objek scanner yang akan digunakan untuk membaca masukan dari pengguna melalui konsol input.

*line 11-19*

```java
while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Lihat Menu");
            System.out.println("3. Edit Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
```

baris kode tersebut adalah sebuah loop while. Ini adalah loop tak terbatas yang akan terus berjalan selama kondisinya selalu bernilai true. Lalu diikuti oleh System.out.println untuk mencetak perintah bagi user untuk menginputkan angka dengan tujuan yang berbeda - beda

int choice adalah perintah untuk membaca masukan pengguna dalam bentuk bilangan tipe interger dari konsol dan menyimpannya dalam variabel choice.

Setelah membaca pilihan pengguna, scanner.nextline adalah perintah untuk membaca baris berikutnya dari inputan milik pengguna.

*line 21-30*
```java
switch (choice) {
                case 1:
                    System.out.print("Masukkan kode menu: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama Menu: ");
                    String name = scanner.nextLine();
                    System.out.print("Harga: ");
                    double price = scanner.nextDouble();
                    MenuManager.addMenuItem(id,name,price);
                    break;
```

digunakan untuk menentukan tindakan yang akan diambil berdasarkan nilai dari variabel choice. Case satu adalah tindakan apabila user menginputkan angka 1. maka akan tercetak perintah untuk memasukkan kode menu, nama, dan harga. Setelah muncul perintah, maka user harus input data yaitu kode menu, nama, dan harga. Scanner berguna untuk membaca setiap inputan user dan menyimpannya dalam sebuah variabel. 

menu manager.addmenuitem adalah perintah untuk memanggil metode addMenuItem dari objek MenuManager dengan tiga argumen: id, name, dan price. Metode ini digunakan untuk menambahkan item menu baru dengan kode, nama, dan harga yang telah dimasukkan oleh pengguna.

*line 31-33*
```java
case 2:
                    MenuManager.showMenu();
                    break;

```
MenuManager.showMenu adalah method yang akan dieksekusi jika choice sama dengan 2. Dalam konteks ini, perintah ini memanggil method showMenu() dari objek MenuManager. Metode ini digunakan untuk menampilkan (mencetak) daftar menu yang telah ditambahkan sebelumnya. Break adalah perintah untuk keluar dari blok switch case 

*line 34-42*

```java
case 3:
                    System.out.print("kode menu yang akan diubah: ");
                    String idmenu = scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String newName = scanner.nextLine();
                    System.out.print("Harga baru: ");
                    double newPrice = scanner.nextDouble();
                    MenuManager.updateMenuItem(idmenu,newName,newPrice);
                    break;
```

Program mencetak perintah untuk user input id menu yang ingin diubah. scanner.nextline membaca inputan user dan memasukkannya kedalam variabel idmenu. Lalu program mencetak perintah untuk memasukkan nama menu dan membacanya dengan scanner. Yang terakhir, perintah untuk memasukkan harga baru dan membacanya dengan scanner dan di masukkan kedalam variabel newPrice. MenuManager.updateMenuItem adalah perintah untuk memanggil metode updateMenuItem dari objek MenuManager dengan tiga argumen: idmenu, newName, dan newPrice. Metode ini digunakan untuk memperbarui menu yang sesuai dengan kode yang dimasukkan oleh pengguna dengan nama dan harga baru.

*line 43-52*

```java
case 4:
                    System.out.print("kode menu yang akan dihapus: ");
                    String deleteId = scanner.nextLine();
                    MenuManager.deleteMenuItem(deleteId);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
```
pada case 4 adalah kondisi dimana akan mencetak perintah untuk user menginput kode menu yang ingin dihapus, Lalu scanner untuk menampung inputan user ke dalam variabel deleteId. kemudian memanggil method deletemenuitem dengan argumen deleteId dalam objek menumanager.

case 5 adalah kondisi untuk keluar dari program yang berisi cetakan output terimakasih dan diikuti System.exit(0) yaitu menghentikan program secara paksa.

<h3>MenuManager.java</h3>

*line 1-3*
```java
package pizzahutClass;
import java.util.ArrayList;
import java.util.List;
```
**line 1-3*
MenuManager.adalah sebuah file class yang disimpan dalam package bernama pizzahutClass. import java util arraylist digunakan untuk mengimpor kelas ArrayList dari paket java.util. Kelas ArrayList adalah struktur data yang digunakan untuk menyimpan dan mengelola kumpulan data dalam bentuk daftar. adalah interface yang digunakan untuk menggambarkan kumpulan data yang disusun dalam urutan tertentu.
