package com.example.desafio_09_01_ciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_09_01_ciclobike.databinding.ActivityMainBinding
import com.example.desafio_09_01_ciclobike.SetupCiclovias as Setup

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.recyclerViewListaCiclovias.adapter = CicloviaAdapter(Setup().init() as MutableList<Ciclovia>)
        binding.recyclerViewListaCiclovias.layoutManager = LinearLayoutManager(this)

        binding.buttonListLasCondes.setOnClickListener {
            binding.recyclerViewListaCiclovias.adapter = CicloviaAdapter(Setup().initLasCondes())
        }

        binding.buttonListAll.setOnClickListener {
            binding.recyclerViewListaCiclovias.adapter = CicloviaAdapter(Setup().init() as MutableList<Ciclovia>)
        }

        ArrayAdapter.createFromResource(this, R.array.spinner_Comunas_options, android.R.layout.simple_spinner_item)
            .also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinnerComunas.adapter = adapter }

    }
}