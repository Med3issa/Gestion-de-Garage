package com.example.gestiondegarage.cur;

public class Cur_item {
    private String name;
    private String price;
    private String label;

    public Cur_item(String name, String price, String label) {
        this.name = name;
        this.price = price;
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
