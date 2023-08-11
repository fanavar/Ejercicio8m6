package cl.awakelab.ejercicio8m6.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_razas")
data class RazaPerroEntity(
@PrimaryKey val raza: String)
