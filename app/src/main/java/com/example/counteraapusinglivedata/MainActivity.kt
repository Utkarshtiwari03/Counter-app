package com.example.counteraapusinglivedata

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.counteraapusinglivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewmod=ViewModelProvider(this).get(viewmodel::class.java)

        viewmod.count.observe(this){
            binding.tv.text= it.toString()
        }

        binding.inc.setOnClickListener{
            viewmod.increment()
        }
        binding.desc.setOnClickListener{
            viewmod.descrement()
        }
        binding.rset.setOnClickListener {
            viewmod.reset()
        }

    }
}