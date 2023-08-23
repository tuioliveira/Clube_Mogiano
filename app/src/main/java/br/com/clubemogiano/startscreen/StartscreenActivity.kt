package br.com.clubemogiano.startscreen

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.R
import br.com.clubemogiano.databinding.ActivityStartscreenBinding

class StartscreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        binding = ActivityStartscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_start,menu);

        return super.onCreateOptionsMenu(menu)
    }
}