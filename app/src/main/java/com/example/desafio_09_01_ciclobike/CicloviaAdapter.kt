package com.example.desafio_09_01_ciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_09_01_ciclobike.databinding.ItemCicloviaBinding

class CicloviaAdapter(var listCiclovia : MutableList<Ciclovia>) :
    RecyclerView.Adapter<CicloviaAdapter.CicloviaViewHolder>() {

    /*
    class CicloviaViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val textViewNombreCiclovia : TextView = itemView.findViewById(R.id.textView_NombreCiclovia)
        val textViewComunaCiclovia : TextView = itemView.findViewById(R.id.textView_ComunaCiclovia)
    }
    */

    class CicloviaViewHolder(itemBinding : ItemCicloviaBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(ciclovia : Ciclovia) {
            //TODO arreglar adapter con view binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloviaViewHolder {
        return CicloviaViewHolder(ItemCicloviaBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return listCiclovia.size
    }

    override fun onBindViewHolder(holderCiclovia: CicloviaViewHolder, position: Int) {
        holderCiclovia.item

        holderCiclovia.textViewNombreCiclovia.text = listCiclovia.get(position).nombre
        holderCiclovia.textViewComunaCiclovia.text = listCiclovia.get(position).comuna
    }

}