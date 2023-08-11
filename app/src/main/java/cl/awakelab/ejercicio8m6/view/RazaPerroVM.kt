package cl.awakelab.ejercicio8m6.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import cl.awakelab.ejercicio8m6.data.Repositorio
import cl.awakelab.ejercicio8m6.data.local.RazaPerroDatabase
import cl.awakelab.ejercicio8m6.data.remote.RazaPerroRetroFit
import kotlinx.coroutines.launch

class RazaPerroVM(application: Application): AndroidViewModel(application) {

    private val repositorio: Repositorio

    fun razaLiveData() = repositorio.getRazaPerroEntity()
    init {
        val api = RazaPerroRetroFit.getRetrofitRazaPerro()
        val razaPerroDatabase= RazaPerroDatabase.getDataBase(application).getRazaPerroDao()
        repositorio = Repositorio(api, razaPerroDatabase)
    }
    fun getRazasPerro() = viewModelScope.launch {
        repositorio.getRazasPerro()
    }

}
