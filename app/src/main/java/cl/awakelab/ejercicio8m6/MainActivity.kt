package cl.awakelab.ejercicio8m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
App listado y detalle de perros
[x] Manifest: activar permisos de internet, android:usesCleartextTraffic="true" y android:enableOnBackInvokedCallback="true"
[x] Gradle: activar viewBinding | Plugin: kotlin-kapt | Dependencias: Coil, Room, RetroFit, navigation, viewModel |
   Se pasó a la version 17 en CompileOptions y KotlinOptions
[] 2 pantallas: Listado y Detalle
[] Navigation
[] Listado: RecyclerView + ViewHolder + Adapter
[] Detalle: RecyclerView + ViewHolder + Adapter
[] Remoto:
    [] DataClass
    [] API (interfaz)
    [] RetroFit
[] Local:
    [] DataBase
    [] Entity
    [] Dao
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}