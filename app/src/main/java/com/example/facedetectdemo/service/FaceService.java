package com.example.facedetectdemo.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Author : Ryans
 * Date : 2022/8/10
 * Introduction :
 */
interface FaceService {

//    @GET("face")
//    fun  face(@Query("img")imgData :String);

    @GET("regist")
    Call<Object> regist(@Query("img") String imgData);
}
