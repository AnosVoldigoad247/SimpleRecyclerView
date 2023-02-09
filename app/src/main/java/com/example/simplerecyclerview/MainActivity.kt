package com.example.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.listData)
        var data = ArrayList<DataGambar>()
        data.add(DataGambar(R.drawable.back_to_heaven_1,"Back To The Heavens"))
        data.add(DataGambar(R.drawable.extraordinary_system_1,"Extraordinary System"))
        data.add(DataGambar(R.drawable.legenda_dewa_bintang_1,"Legenda Dewa Bintang"))
        data.add(DataGambar(R.drawable.mata_sang_dewa_1,"Mata Sang Dewa"))
        data.add(DataGambar(R.drawable.modern_cultivator_1,"Modern Cultivator"))
        data.add(DataGambar(R.drawable.night_king_my_life_journey_1,"Night King My Life Journey"))

        recyclerAdapter = Adapter(data)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager
    }
}