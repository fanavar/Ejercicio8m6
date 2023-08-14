package cl.awakelab.ejercicio8m6.data

import cl.awakelab.ejercicio8m6.data.local.RazaDetalleEntity
import cl.awakelab.ejercicio8m6.data.local.RazaPerroEntity


fun String.toEntity(id: String): RazaDetalleEntity = RazaDetalleEntity(id, this) //función de extensión

fun String.toRazaEntity(): RazaPerroEntity = RazaPerroEntity(this) //función de extensión

