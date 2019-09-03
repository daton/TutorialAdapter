package com.example.tutorialadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemito.view.*


class PersonaListAdapter (ctx: Context,val  misDatos:ArrayList<Persona>): RecyclerView.Adapter<PersonaListAdapter.PersonaViewHolder>(){

    private var inflater = LayoutInflater.from(ctx)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
val  itemView=inflater.inflate(R.layout.itemito,parent, false)
        return  PersonaViewHolder(itemView)
    }

    override fun getItemCount()=misDatos.size

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
   holder.nombreItemView.text=misDatos[position].nombre
        //Aqui va el llenado de otros mas
    }



    inner  class PersonaViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
      val nombreItemView= itemView.textView
        //Aqui otras vistas como el textView

    }
}