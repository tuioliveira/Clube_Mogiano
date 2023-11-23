package br.com.clubemogiano.associados

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivityComunicadosBinding

class ComunicadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComunicadosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivityComunicadosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}