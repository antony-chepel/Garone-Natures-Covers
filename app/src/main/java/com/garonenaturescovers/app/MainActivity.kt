package com.garonenaturescovers.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.garonenaturescovers.app.databinding.ActivityMainBinding
import com.garonenaturescovers.app.garonedapater.GaroneAdapter
import com.garonenaturescovers.app.garoneutils.GaroneUtils

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var pslsasdad : GaroneAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        jdfsdfs()
    }

    private fun jdfsdfs() = with(binding){
        pslsasdad = GaroneAdapter(GaroneUtils.ksdjfjsfjs,this@MainActivity)
        ldowqjwe.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        ldowqjwe.adapter = pslsasdad


    }
}