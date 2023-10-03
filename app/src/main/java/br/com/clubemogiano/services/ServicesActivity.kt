package br.com.clubemogiano.services

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivityServicesBinding

class ServicesActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityServicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivityServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showToast(this, "Serviços")

        setSupportActionBar(binding.toolbarServices)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.apply {
            title = "Services"
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
