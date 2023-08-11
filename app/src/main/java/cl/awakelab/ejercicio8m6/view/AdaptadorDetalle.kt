package cl.awakelab.ejercicio8m6.view

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.ejercicio8m6.data.local.RazaDetalleEntity
import cl.awakelab.ejercicio8m6.databinding.FragmentDetalleBinding
import cl.awakelab.ejercicio8m6.databinding.ItemDetallePerroBinding
import coil.load

class AdaptadorDetalle: RecyclerView.Adapter<AdaptadorDetalle.DetallePerroViewHolder>() {

  lateinit var binding: ItemDetallePerroBinding
  private val listDetallePerro = mutableListOf<RazaDetalleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallePerroViewHolder {
        binding = ItemDetallePerroBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return DetallePerroViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return listDetallePerro.size
    }

    override fun onBindViewHolder(holder: DetallePerroViewHolder, position: Int) {
        val perro = listDetallePerro[position]
        holder.bind(perro)
    }

    fun setDataDetalle(detalle: List<RazaDetalleEntity>){
        this.listDetallePerro.clear()
        this.listDetallePerro.addAll(detalle)
        notifyDataSetChanged()
    }

    class DetallePerroViewHolder(val perroVista: ItemDetallePerroBinding): RecyclerView.ViewHolder(perroVista.root) {
        fun bind(detalle: RazaDetalleEntity){
            perroVista.imageViewDetalle.load(detalle.url)
        }

    }
}