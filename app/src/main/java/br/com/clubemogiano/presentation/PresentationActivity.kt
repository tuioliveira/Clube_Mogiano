package br.com.clubemogiano.presentation

import br.com.clubemogiano.databinding.ActivityPresentationBinding
import android.content.Context
import android.widget.Toast


class PresentationActivity {

    private lateinit var binding: ActivityPresentationBinding

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}