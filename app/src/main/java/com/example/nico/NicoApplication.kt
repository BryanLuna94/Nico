package com.example.nico

import android.app.Application
import com.example.nico.connect.ApiUtils
import com.example.nico.connect.ApiService



class NicoApplication: Application() {

    var api: ApiService?=null

    fun getApiService(): ApiService? {
        if (api == null) {
            api = ApiUtils().getService()
        }
        return api
    }

}