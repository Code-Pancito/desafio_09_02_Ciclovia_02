package com.example.desafio_09_01_ciclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CicloviaAdapter(var listCiclovia : MutableList<Ciclovia>) :
    RecyclerView.Adapter<CicloviaAdapter.CicloviaViewHolder>() {

    class CicloviaViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val textViewNombreCiclovia : TextView = itemView.findViewById(R.id.textView_NombreCiclovia)
        val textViewComunaCiclovia : TextView = itemView.findViewById(R.id.textView_ComunaCiclovia)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloviaViewHolder {
        return CicloviaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ciclovia, parent, false))
    }

    override fun getItemCount(): Int {
        return listCiclovia.size
    }

    override fun onBindViewHolder(holderCiclovia: CicloviaViewHolder, position: Int) {
        holderCiclovia.textViewNombreCiclovia.text = listCiclovia.get(position).nombre
        holderCiclovia.textViewComunaCiclovia.text = listCiclovia.get(position).comuna
    }

}