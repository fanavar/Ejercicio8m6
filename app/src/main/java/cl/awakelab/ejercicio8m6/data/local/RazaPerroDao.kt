package cl.awakelab.ejercicio8m6.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface RazaPerroDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRazaPerro(razaPerroEntity: RazaPerroEntity)

    @Query("Select * from tabla_razas order by raza desc")
    fun getRazasPerro(): LiveData<RazaPerroEntity>
}