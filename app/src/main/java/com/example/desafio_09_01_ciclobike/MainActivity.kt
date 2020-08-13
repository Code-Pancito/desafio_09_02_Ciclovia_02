package com.example.desafio_09_01_ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_09_01_ciclobike.SetupCiclovias as Setup

class MainActivity : AppCompatActivity() {

    lateinit var buttonListLasCondes : Button
    lateinit var buttonListAll : Button
    lateinit var recyclerViewLista : RecyclerView
    lateinit var cicloviaAdapter: CicloviaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewLista = findViewById(R.id.recyclerView_ListaCiclovias)
        recyclerViewLista.adapter = CicloviaAdapter(Setup().init() as MutableList<Ciclovia>)
        recyclerViewLista.layoutManager = LinearLayoutManager(this)

        buttonListLasCondes = findViewById(R.id.button_List_LasCondes)
        buttonListLasCondes.setOnClickListener {
            recyclerViewLista.adapter = CicloviaAdapter(Setup().initLasCondes())
        }

        buttonListAll = findViewById(R.id.button_ListAll)
        buttonListAll.setOnClickListener {
            recyclerViewLista.adapter = CicloviaAdapter(Setup().init() as MutableList<Ciclovia>)
        }
    }
}