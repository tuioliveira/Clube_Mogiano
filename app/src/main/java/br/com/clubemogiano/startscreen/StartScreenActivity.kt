package br.com.clubemogiano.startscreen

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.R
import br.com.clubemogiano.databinding.ActivityStartScreenBinding
import android.content.Intent
import br.com.clubemogiano.associados.AssociadosActivity
import br.com.clubemogiano.associados.ComunicadosActivity
import br.com.clubemogiano.services.ServicesActivity
import br.com.clubemogiano.social.SocialActivity
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

        binding.sportsButton.setOnClickListener {
            val intent = Intent(this, SportsActivity::class.java)
            startActivity(intent)
        }
        binding.socialButton.setOnClickListener {
            val intent = Intent(this, SocialActivity::class.java)
            startActivity(intent)
        }
        binding.servicesButton.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }
        binding.associadoButton.setOnClickListener {
            val intent = Intent(this, AssociadosActivity::class.java)
            startActivity(intent)
        }
        binding.comunicadosButton.setOnClickListener {
            val intent = Intent(this, ComunicadosActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_start, menu)

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
