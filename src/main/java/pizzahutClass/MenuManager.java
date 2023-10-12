package pizzahutClass;

import java.util.ArrayList;
import java.util.List;

public final class MenuManager {
    private static List<MenuItem> menuItems = new ArrayList<>();

    public final static void showMenu() {
        System.out.println("Daftar Menu Makanan:");
        System.out.println("A001 - QUARTZA PIZZA!! - Rp 120.000");
        System.out.println("A002 - BIG BOX PACKET PIZZA!! - Rp 145.455 ");
        System.out.println("B001 - TOKYO GYU PIZZA - Rp 125.000");
        System.out.println("C001 - TRIPLE BOX!!! - Rp 254.545");
        
        for (MenuItem item : menuItems) {
            System.out.println(item.getId() + " - " + item.getName() + " - Rp " + item.getPrice());
        }
    }

    public final static void addMenuItem(String id, String name, double price) {
        menuItems.add(new MenuItem(id, name, price));
        System.out.println("Menu " + name + " berhasil ditambahkan.");
    }

    public final static void updateMenuItem(String id, String newName, double newPrice) {
        for (MenuItem item : menuItems) {
            if (item.getId().equals(id)) {
                item.setName(newName);
                item.setPrice(newPrice);
                System.out.println("Kode Menu " + newName + " berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Kode menu " + id + " tidak ditemukan.");
    }

    public final static void deleteMenuItem(String id) {
        for (MenuItem item : menuItems) {
            if (item.getId().equals(id)) {
                menuItems.remove(item);
                System.out.println("Kode Menu " + id + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kode Menu " + id + " tidak ditemukan.");
    }
}
