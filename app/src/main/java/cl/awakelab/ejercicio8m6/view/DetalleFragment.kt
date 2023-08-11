package cl.awakelab.ejercicio8m6.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.awakelab.ejercicio8m6.R
import cl.awakelab.ejercicio8m6.databinding.FragmentDetalleBinding
import cl.awakelab.ejercicio8m6.databinding.FragmentListadoRazasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "id"

class DetalleFragment : Fragment() {
    lateinit var binding: FragmentDetalleBinding
    private val razaPerroVM: RazaPerroVM by activityViewModels()

    private var param1: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalleBinding.inflate(layoutInflater, container, false)
        initAdapter()
        razaPerroVM.getDetallePerroVM(param1.toString())
        return binding.root
    }

    private fun initAdapter() {

    }


}