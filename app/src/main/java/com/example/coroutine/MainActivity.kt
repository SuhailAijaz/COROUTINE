package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
class MainActivity : AppCompatActivity() {
    private  lateinit var textView: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterClass: AdapterClass
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.apply {
            setHasFixedSize(true)
            linearLayoutManager = LinearLayoutManager(context)
            layoutManager = linearLayoutManager
        }
 GlobalScope.launch {
     val dataget=RetroInstance.getInstance().getdata()


 }

    }


    }
