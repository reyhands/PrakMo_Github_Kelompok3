package com.example.githubku.api;

import com.example.githubku.model.*;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface apiInterface {
    @GET("search/repositories?q=reyhan")
    //Call<getRepository> getRepository(@Query("q") String search);
    Call<getRepository> getRepository();

   // @FormUrlEncoded
    //@POST("repository")
    //Call<editRepository> post(@Field("nama") String nama,
                                        //@Field("nomor") String nomor);
    //@FormUrlEncoded
    //@PUT("kontak")
    //Call<editRepository> putKontak(@Field("id") String id,
                                     //@Field("nama") String nama,
                                     //@Field("nomor") String nomor);
    //@FormUrlEncoded
    //@HTTP(method = "DELETE", path = "kontak", hasBody = true)
    //Call<editRepository> deleteKontak(@Field("id") String id);
}
