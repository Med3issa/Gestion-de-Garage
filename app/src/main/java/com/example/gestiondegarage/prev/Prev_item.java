package com.example.gestiondegarage.prev;

public class Prev_item {
    private String name;
    private String date_c;
    private String date_p;


    public Prev_item(String name, String date_c, String date_p) {
        this.name = name;
        this.date_c = date_c;
        this.date_p = date_p;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_c() {
        return date_c;
    }

    public void setDate_c(String date_c) {
        this.date_c = date_c;
    }

    public String getDate_p() {
        return date_p;
    }

    public void setDate_p(String date_p) {
        this.date_p = date_p;
    }


}
