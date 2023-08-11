package cl.awakelab.ejercicio8m6.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.awakelab.ejercicio8m6.R
import cl.awakelab.ejercicio8m6.databinding.FragmentListadoRazasBinding


class ListadoRazas : Fragment() {
    lateinit var binding: FragmentListadoRazasBinding
    private val razaPerroVM: RazaPerroVM by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListadoRazasBinding.inflate(layoutInflater, container, false)
        initAdapter()
        razaPerroVM.getRazasPerro()
        return binding.root
    }
    private fun initAdapter() {
        val adapter = AdaptadorRazas()

        binding.rvListadoRazas.adapter = adapter
        razaPerroVM.razaLiveData().observe(viewLifecycleOwner){
            adapter.setData(it)
        }
    }


}