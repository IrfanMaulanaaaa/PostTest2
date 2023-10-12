package com.pizzahut;

import java.util.Scanner;
import pizzahutClass.MenuManager;

public class Pizzahut {
    public final static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Lihat Menu");
            System.out.println("3. Edit Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

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
                case 2:
                    MenuManager.showMenu();
                    break;
                case 3:
                    System.out.print("kode menu yang akan diubah: ");
                    String idmenu = scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String newName = scanner.nextLine();
                    System.out.print("Harga baru: ");
                    double newPrice = scanner.nextDouble();
                    MenuManager.updateMenuItem(idmenu,newName,newPrice);
                    break;
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
            }
        }
    }
}
