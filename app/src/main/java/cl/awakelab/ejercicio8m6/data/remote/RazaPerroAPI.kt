package cl.awakelab.ejercicio8m6.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface RazaPerroAPI {
    @GET("breeds/list/all")
    suspend fun getData(): Response<RazaPerro>
}