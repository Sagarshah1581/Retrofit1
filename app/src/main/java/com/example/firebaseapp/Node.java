package com.example.firebaseapp;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Node {

    @POST("/register/")

    Observable<String> registerUser(@Field("FName") String fname,
                                    @Field("phone") String phone,



}
