package com.example.caocap_01.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.caocap_01.Adapter.ExploreAdapter
import com.example.caocap_01.Database.caocap
import com.example.caocap_01.Database.mySimpleData
import com.example.caocap_01.Database.mySimpleData2
import com.example.caocap_01.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var exploreAdapter: ExploreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exploreAdapter = ExploreAdapter(this, mySimpleData2.cs)
        explore.adapter = exploreAdapter
        explore.layoutManager = GridLayoutManager(this,2)


    }
}
