package cl.awakelab.ejercicio8m6.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RazaPerroRetroFit {

    companion object{
        private const val URL_BASE = "https://dog.ceo/api/"

        fun getRetrofitRazaPerro(): RazaPerroAPI{
            val mRetroFit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mRetroFit.create(RazaPerroAPI::class.java)
        }
    }
}