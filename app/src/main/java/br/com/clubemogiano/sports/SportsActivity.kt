package br.com.clubemogiano.sports

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import br.com.clubemogiano.databinding.ActivitySportsBinding
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.academia.AcademiaActivity
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

        setSupportActionBar(binding.toolbarSports)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.apply {
            title = "Esportes"
        }
        binding.academiaButton.setOnClickListener{
            val intent = Intent(this, AcademiaActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}