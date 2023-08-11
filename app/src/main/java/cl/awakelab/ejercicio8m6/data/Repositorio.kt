package cl.awakelab.ejercicio8m6.data

import android.util.Log
import androidx.lifecycle.LiveData
import cl.awakelab.ejercicio8m6.data.local.RazaDetalleEntity
import cl.awakelab.ejercicio8m6.data.local.RazaPerroDao
import cl.awakelab.ejercicio8m6.data.local.RazaPerroEntity
import cl.awakelab.ejercicio8m6.data.remote.RazaPerroAPI

class Repositorio(private val razaPerroAPI: RazaPerroAPI, private val razaPerroDao: RazaPerroDao) {
    fun getRazaPerroEntity(): LiveData<List<RazaPerroEntity>> = razaPerroDao.getRazasPerro()
    fun getRazaDetalleEntity(id: String): LiveData<List<RazaDetalleEntity>> = razaPerroDao.getRazaDetalle(id)
    suspend fun getRazasPerro() {
        val response = razaPerroAPI.getData()//acá llegan los datos
        if(response.isSuccessful){ // llegaron los datos?
            val message = response.body()!!.message //solo sacando la parte de message, sin status
            val keys = message.keys

            keys.forEach {
                val razaPerroEntity = RazaPerroEntity(it)
                razaPerroDao.insertRazaPerro(razaPerroEntity)
            }
        }else{
            Log.e("repositorio", response.errorBody().toString())
        }
    }
    suspend fun getDetallePerro(id: String) {
        val response = razaPerroAPI.getDetallePerro(id)
        if(response.isSuccessful){
            response.body()!!.message.forEach{
                val razaDetalleEntity = RazaDetalleEntity(id, it)
                razaPerroDao.insertDetallePerro(razaDetalleEntity)
            }
        }else{
            Log.e("repositorio", response.errorBody().toString())
        }
    }
}