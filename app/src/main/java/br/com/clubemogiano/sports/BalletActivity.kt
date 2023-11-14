package br.com.clubemogiano.sports

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivityBalletBinding

class BalletActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBalletBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {

        binding = ActivityBalletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarBallet)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.apply {
            title = "Ballet"
        }

        binding.segundaFeira.setOnClickListener {

        }
        binding.tercaFeira.setOnClickListener {

        }
        binding.quartaFeira.setOnClickListener {

        }
        binding.quintaFeira.setOnClickListener {

        }
        binding.sextaFeira.setOnClickListener {

        }
    }

    private fun checarVisibilidade() {
        if (binding.grupoTabela.visibility == View.VISIBLE) {

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}