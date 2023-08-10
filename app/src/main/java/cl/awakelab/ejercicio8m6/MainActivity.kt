package cl.awakelab.ejercicio8m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
App listado y detalle de perros
[x] Manifest: activar permisos de internet, android:usesCleartextTraffic="true" y android:enableOnBackInvokedCallback="true"
[x] Gradle: activar viewBinding | Plugin: kotlin-kapt | Dependencias: Coil, Room, RetroFit, navigation, viewModel |
   Se pasó a la version 17 en CompileOptions y KotlinOptions
[x] Se creó la estructura de paquetes: data(local y remote) y view(correspondiente a la presentación)
[X] Se creó la branch funcionalidad/consumo_remoto
[] 2 pantallas: Listado y Detalle
[] Navigation
[] Listado: RecyclerView + ViewHolder + Adapter
[] Detalle: RecyclerView + ViewHolder + Adapter
[x] Remoto:
    [x] DataClass
    [x] API (interfaz)
    [x] RetroFit
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