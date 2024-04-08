package com.example.java12;


public class Grocery {
    private final String name;
    private final String note;
    private final boolean important;

    public Grocery(String name, String note, boolean important) {
        this.name = name;
        this.note = note;
        this.important = important;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public boolean isImportant() {
        return important;
    }
}
