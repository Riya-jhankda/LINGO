package com.example.lingo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lingo.databinding.ActivityLanguagesBinding

class Languages  : AppCompatActivity() {

    private lateinit var binding:ActivityLanguagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_languages)

        binding= ActivityLanguagesBinding.inflate(layoutInflater)
        val view =binding.root

        setContentView(view)
    }
}