package br.com.clubemogiano.social

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivitySocialBinding
import br.com.clubemogiano.databinding.ActivitySportsBinding

class SocialActivity : AppCompatActivity() {
    private lateinit var  binding: ActivitySocialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivitySocialBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showToast(this, "Social")

        setSupportActionBar(binding.toolbarSocial)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.apply {
            title = "Social"
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
