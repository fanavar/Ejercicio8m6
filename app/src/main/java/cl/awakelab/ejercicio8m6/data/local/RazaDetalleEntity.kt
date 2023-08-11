package cl.awakelab.ejercicio8m6.data.local

import androidx.room.Entity

@Entity(tableName = "tabla_razas_detalle", primaryKeys = ["razaDetalle", "url"])
data class RazaDetalleEntity(
    val raza_detalle: String,
    val url: String
)