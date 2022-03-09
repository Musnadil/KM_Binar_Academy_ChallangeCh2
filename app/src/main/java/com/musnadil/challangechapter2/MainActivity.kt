package com.musnadil.challangechapter2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musnadil.challangechapter2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val actionbar = supportActionBar
        actionbar?.hide()

        viewBinding.btnShopee.setOnClickListener {
            startActivity(Intent(this,Shopee::class.java))
        }
        viewBinding.btnGojek.setOnClickListener {
            startActivity(Intent(this,Gojek::class.java))
        }
    }
}