package com.example.lingo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.lingo.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        binding=ActivityStartBinding.inflate(layoutInflater)
        val view =binding.root

        setContentView(view)

        binding.strtBtn.setOnClickListener {
            val intent= Intent(this,Languages::class.java)
            startActivity(intent)

        }
    }
}