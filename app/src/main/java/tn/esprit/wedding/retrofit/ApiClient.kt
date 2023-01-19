package tn.esprit.wedding.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object{
        val URL ="http://10.0.2.2:3030/"
        //val URL="https://moody-kiwis-wear-196-203-207-178.loca.lt"
        var retrofit: Retrofit? = null
        fun getApiClient(): Retrofit? {
            if (retrofit == null) {
                retrofit =
                    Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit
        }

    }
}