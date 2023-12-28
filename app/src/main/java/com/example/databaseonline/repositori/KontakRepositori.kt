package com.example.databaseonline.repositori

import com.example.databaseonline.modeldata.Kontak
import com.example.databaseonline.service_api.KontakService

interface KontakRepository {

    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}

