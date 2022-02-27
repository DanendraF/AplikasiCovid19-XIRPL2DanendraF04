package com.example.aplikasicovid_19.api

import com.example.aplikasicovid_19.api.model.IndonesiaResponse
import com.example.aplikasicovid_19.api.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}
