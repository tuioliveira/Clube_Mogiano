package br.com.clubemogiano.sports

import android.content.Context
import android.os.Bundle
import br.com.clubemogiano.databinding.ActivitySportsBinding
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivityStartScreenBinding


class SportsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySportsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivitySportsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showToast(this, "Esportes")
    }

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}