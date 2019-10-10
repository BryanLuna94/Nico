package com.example.nico.connect

import com.example.nico.utils.Constantes


class ApiUtils {

    fun getService(): ApiService {
        return ApiClient().getClient(Constantes.URL).create(ApiService::class.java)
    }

}