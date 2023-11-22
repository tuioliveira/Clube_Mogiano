package br.com.clubemogiano.associados

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivityAssociadosBinding

class AssociadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAssociadosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivityAssociadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fechar.setOnClickListener {
            finish()
        }
    }
}