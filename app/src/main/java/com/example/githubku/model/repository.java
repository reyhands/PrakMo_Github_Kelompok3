package com.example.githubku.model;

import com.google.gson.annotations.SerializedName;

public class repository {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String nama;
    @SerializedName("description")
    private String description;

    @SerializedName("html_url")
    private String html_url;
    @SerializedName("created_at")
    private String date;



    public repository(){}

    public repository(String id, String nama, String description, String html_url, String date) {
        this.id = id;
        this.nama = nama;
        this.description = description;
        this.html_url = html_url;
        this.date = date;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }





}
