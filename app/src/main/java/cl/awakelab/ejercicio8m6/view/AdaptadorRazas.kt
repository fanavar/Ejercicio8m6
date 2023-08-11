package cl.awakelab.ejercicio8m6.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.ejercicio8m6.data.local.RazaPerroEntity
import cl.awakelab.ejercicio8m6.databinding.FragmentListadoRazasBinding
import cl.awakelab.ejercicio8m6.databinding.ItemRazasBinding

/*
[x] Item Layout
[x] Agregar constraint
[x] Implementar clase Adapter
[x] Heredar RecyclerView.Adapter
[x] Crear clase anidada ViewHolder, que hereda de la clase ViewHolder
[x] Agregar constructor (implement members)
[] Crear objeto, data class
[] Crear lista
[] Asignar tamaño de la lista en getItemCount
[] Definir Binding Class del Item
[] Cambiar View por el binding
[] Declarar variable item en onBindViewHolder
[] Implementar binding en clase ViewHolder
[] Adapter + ViewHolder
[] Obtener los datos
*/
class AdaptadorRazas: RecyclerView.Adapter<AdaptadorRazas.ItemRazasViewHolder>() {

    lateinit var binding: ItemRazasBinding
    private val listItemRazas = mutableListOf<RazaPerroEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRazasViewHolder {
        binding = ItemRazasBinding.inflate(LayoutInflater.from(parent.context),parent, false)

        return ItemRazasViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listItemRazas.size
    }

    override fun onBindViewHolder(holder: ItemRazasViewHolder, position: Int) {
        val raza = listItemRazas[position]
        holder.bind(raza)
    }

    fun setData(razas: List<RazaPerroEntity>){
        this.listItemRazas.clear()
        this.listItemRazas.addAll(razas)
        notifyDataSetChanged()
    }
   class ItemRazasViewHolder(val razasVistas: ItemRazasBinding): RecyclerView.ViewHolder(razasVistas.root) {
        fun bind(raza: RazaPerroEntity){
            razasVistas.textViewRaza.text = raza.raza

        }
    }
}