package cl.awakelab.ejercicio8m6.data

import cl.awakelab.ejercicio8m6.data.local.RazaPerroDao
import cl.awakelab.ejercicio8m6.data.local.RazaPerroEntity
import cl.awakelab.ejercicio8m6.data.remote.RazaPerroAPI

class Repositorio(private val razaPerroAPI: RazaPerroAPI, private val razaPerroDao: RazaPerroDao) {

    suspend fun getRazasPerro() {
        val response = razaPerroAPI.getData()//acá llegan los datos
        if(response.isSuccessful){ // llegaron los datos?
            val message = response.body()!!.message //solo sacando la parte de message, sin status
            val keys = message.keys
            keys.forEach {
                val razaPerroEntity = RazaPerroEntity(it)
                razaPerroDao.insertRazaPerro(razaPerroEntity)
            }
        }
    }
}