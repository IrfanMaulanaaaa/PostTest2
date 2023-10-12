/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzahutClass;

public final class PizzaMenuItem extends MenuItem {
    private String size;

    public PizzaMenuItem(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(String size) {
        this.size = size;
    }
}
