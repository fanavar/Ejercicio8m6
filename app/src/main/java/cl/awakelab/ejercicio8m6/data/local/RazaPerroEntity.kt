package cl.awakelab.ejercicio8m6.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_razas")
class RazaPerroEntity( val raza: String) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

}
