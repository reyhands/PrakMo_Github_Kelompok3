package com.example.githubku.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getRepository {
    String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<repository> listRepository ;
    @SerializedName("message")
    String message;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void setListRepository(List<repository> listRepository) {
       this.listRepository = listRepository;
    }

    public List<repository> getListRepository() {
        return listRepository;
    }
}
