package com.example.githubku.model;

import com.google.gson.annotations.SerializedName;

public class editRepository {

    @SerializedName("status")
    String status;
    @SerializedName("result")
    repository mRepository;
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
    public repository getRepository() {
        return mRepository;
    }
    public void setRepository(repository repository) {
        mRepository = repository;
    }

}
