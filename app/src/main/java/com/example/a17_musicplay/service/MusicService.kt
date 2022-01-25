package com.example.a17_musicplay.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/114e0352-9829-411a-a355-96d19f8fb87e")
    fun listMusics(): Call<MusicDto>
}