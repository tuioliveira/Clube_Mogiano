package br.com.clubemogiano.startscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.R
import br.com.clubemogiano.databinding.ActivityStartScreenBinding
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.widget.TextView
import br.com.clubemogiano.sports.SportsActivity

class StartScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivityStartScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarStart)

        supportActionBar?.apply {
            title = "Clube Mogiano"
        }

        binding.sportsButton.setOnClickListener{
            val intent = Intent(this, SportsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_start, menu);

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_nossa_historia -> {
                true
            }

            R.id.item_institucional -> {
                true
            }

            R.id.item_locacao -> {
                true
            }

            R.id.item_galerias -> {
                true
            }

            R.id.item_notícias -> {
                true
            }

            R.id.item_contato -> {
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}