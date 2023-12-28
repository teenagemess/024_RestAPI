package com.example.databaseonline.service_api

import com.example.databaseonline.modeldata.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers

interface KontakService {
    @Headers(
        "Accept: application/json"
    )
    @GET("/kontak")
    suspend fun getKontak(): List<Kontak>
}