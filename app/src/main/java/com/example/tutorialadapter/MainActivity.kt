package com.example.tutorialadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista= ArrayList<Persona>()

        var persona=Persona()
        persona.email="yo@gmail.com"
        persona.nombre="Juan Carlos"

        var persona2=Persona()
        persona2.email="tu@gmail.com"
        persona2.nombre="Pedro"


        lista.add(persona)
        lista.add(persona2)


        val recycleView=  my_recyclerview as RecyclerView
        viewAdapter=PersonaListAdapter(this,lista)
        viewManager= LinearLayoutManager(this)
        recycleView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
    }
}
