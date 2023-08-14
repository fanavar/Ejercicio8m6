package cl.awakelab.ejercicio8m6.data

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {
        //Given ... dado este valor
        val url = "datoUrl"
        val id = "datoId"

        //When... hago esto
        val resultadoTransformacion = url.toEntity(id)

        //Then... y espero este resultado
        assertEquals(id, resultadoTransformacion.razadetalle)
        assertEquals(url, resultadoTransformacion.url)
    }

    @Test
    fun toRazaEntity() {
        //Given ... dado este valor
        val raza = "rotweiller"

        //When... hago esto
        val resultadoTrans = raza.toRazaEntity()

        //Then... y espero este resultado
        assertEquals(raza, resultadoTrans.raza)
    }
}