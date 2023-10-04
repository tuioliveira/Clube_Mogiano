package br.com.clubemogiano.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.databinding.ActivitySplashScreenBinding
import br.com.clubemogiano.startscreen.StartScreenActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

    }

    private fun init() {
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.logotypeScreen.alpha = 0f
        binding.logotypeScreen.animate().setDuration(2500).alpha(1f).withEndAction {
            val intent = Intent(this, StartScreenActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}
