package br.com.clubemogiano.presentation

import android.content.Context
import br.com.clubemogiano.databinding.ActivitySportsBinding
import android.widget.Toast


class SportsActivity {

    private lateinit var binding: ActivitySportsBinding

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}