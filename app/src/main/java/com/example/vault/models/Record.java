package com.example.vault.models;

public class Record {
    private int id;
    private String title;


    public Record(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
