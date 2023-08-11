package cl.awakelab.ejercicio8m6.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RazaPerroEntity::class, RazaDetalleEntity::class], version = 1)
abstract class RazaPerroDatabase: RoomDatabase(){
    abstract fun getRazaPerroDao(): RazaPerroDao

    companion object{
        @Volatile
        private var INSTANCE: RazaPerroDatabase? = null

        fun getDataBase(context: Context): RazaPerroDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RazaPerroDatabase::class.java,
                    "razas_database"
                ).build()

                INSTANCE = instance
                return instance
            }

    }
}}
