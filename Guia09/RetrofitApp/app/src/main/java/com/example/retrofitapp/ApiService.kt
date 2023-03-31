package com.example.retrofitapp

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{raza}/images")
    fun getDogsByBreed(@Path("raza") raza: String?): Call<DogsResponse?>?
}

private val apiService: ApiService
private get(){
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dog.ceo/api/breed/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return retrofit.create(ApiService::class.java)
}