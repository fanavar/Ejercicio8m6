package cl.awakelab.ejercicio8m6.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RazaPerroAPI {
    @GET("breeds/list/all")
    suspend fun getData(): Response<RazaPerro>

    @GET("/breed/{id}/images")
    suspend fun getDetallePerro(@Path("id") id: String): Response<DetallePerro>
}