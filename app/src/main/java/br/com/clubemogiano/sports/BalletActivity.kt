package br.com.clubemogiano.sports

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.clubemogiano.R
import br.com.clubemogiano.databinding.ActivityBalletBinding

class BalletActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBalletBinding

    private var visibilidadeDaTabela = true
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
            checarVisibilidade()
            ajustarTexto(
                "09:00 - 05 ANOS [SALA 02] de 5 a 5 anos.\n10:00 - 04 e 05 ANOS [SALA 02] de 4 a 5 anos.",
                "15:00 - 4º A 6º ANO ESCOLAR [SALA 02]\n15:00 - 4º A 6º ANO ESCOLAR [SALA 02] ",
                "[MATRICULA COM O PROFESSOR]\n18:00 - BALLET AVANÇADO [SALA 02]"
            )
            selecionarDrawable(1)
        }
        binding.tercaFeira.setOnClickListener {
            checarVisibilidade()
            ajustarTexto(
                "08:00 - 5º ANO ESCOLAR [SALA 02]\n09:00 - 4º ANO ESCOLAR [SALA 02]\n10:00 - 1º ANO ESCOLAR [SALA 02]",
                "14:00 - 7ª E 8ª ANO ESCOLAR [SALA 02]",
                ""
            )
            selecionarDrawable(2)
        }
        binding.quartaFeira.setOnClickListener {
            checarVisibilidade()
            ajustarTexto(
                "08:00 - 6º E 7º ANO ESCOLAR [SALA 02]\n09:00 - 2º E 3º ANO ESCOLAR [SALA 02]\n10:00 - 1º ANO ESCOLAR [SALA 02]",
                "15:00 - 4º A 6º ANO ESCOLAR [SALA 02]\n15:00 - 4º A 6º ANO ESCOLAR [SALA 02] ",
                "[MATRICULA COM O PROFESSOR]\n18:00 - BALLET AVANÇADO [SALA 02]"
            )
            selecionarDrawable(3)
        }
        binding.quintaFeira.setOnClickListener {
            checarVisibilidade()
            ajustarTexto(
                "08:00 - 5º ANO ESCOLAR [SALA 02]\n09:00 - 4º ANO ESCOLAR [SALA 02]\n10:00 - 1º ANO ESCOLAR [SALA 02]",
                "14:00 - 7ª E 8ª ANO ESCOLAR [SALA 02]",
                ""
            )
            selecionarDrawable(4)
        }
        binding.sextaFeira.setOnClickListener {
            checarVisibilidade()
            ajustarTexto(
                "08:00 - 6º E 7º ANO ESCOLAR [SALA 02]\n09:00 - 2º E 3º ANO ESCOLAR [SALA 02]\n10:00 - 1º ANO ESCOLAR [SALA 02]",
                "",
                ""
            )
            selecionarDrawable(5)

        }
    }

    private fun checarVisibilidade() {
        if (binding.periodoDaNoite.visibility == View.VISIBLE &&
            binding.periodoDaManha.visibility == View.VISIBLE &&
            binding.periodoDaTarde.visibility == View.VISIBLE
        ) {
            binding.periodoDaNoite.visibility = View.GONE
            binding.periodoDaManha.visibility = View.GONE
            binding.periodoDaTarde.visibility = View.GONE
        } else {
            binding.periodoDaNoite.visibility = View.VISIBLE
            binding.periodoDaManha.visibility = View.VISIBLE
            binding.periodoDaTarde.visibility = View.VISIBLE
        }

    }

    private fun ajustarTexto(
        periodoDaManha: String,
        periodoDaTarde: String,
        periodoDaNoite: String
    ) {
        binding.periodoDaManhaValue.text = periodoDaManha
        binding.periodoDaTardeValue.text = periodoDaTarde
        binding.periodoDaNoiteValue.text = periodoDaNoite
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun selecionarDrawable(
        diaDaSemana: Int
    ) {
        when (diaDaSemana) {
            1 -> {
                if (binding.periodoDaNoite.visibility == View.VISIBLE &&
                    binding.periodoDaManha.visibility == View.VISIBLE &&
                    binding.periodoDaTarde.visibility == View.VISIBLE
                ) {
                    binding.segundaFeira.background =
                        getDrawable(R.drawable.fundo_tabela_selecionado)
                    binding.tercaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quartaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quintaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.sextaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                } else {
                    alterarTodosParaCinza()
                }

            }

            2 -> {
                if (binding.periodoDaNoite.visibility == View.VISIBLE &&
                    binding.periodoDaManha.visibility == View.VISIBLE &&
                    binding.periodoDaTarde.visibility == View.VISIBLE
                ) {
                    binding.segundaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.tercaFeira.background =
                        getDrawable(R.drawable.fundo_tabela_selecionado)
                    binding.quartaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quintaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.sextaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                } else {
                    alterarTodosParaCinza()
                }

            }

            3 -> {

                if (binding.periodoDaNoite.visibility == View.VISIBLE &&
                    binding.periodoDaManha.visibility == View.VISIBLE &&
                    binding.periodoDaTarde.visibility == View.VISIBLE
                ) {
                    binding.segundaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.tercaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quartaFeira.background =
                        getDrawable(R.drawable.fundo_tabela_selecionado)
                    binding.quintaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.sextaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                } else {
                    alterarTodosParaCinza()
                }
            }

            4 -> {
                if (binding.periodoDaNoite.visibility == View.VISIBLE &&
                    binding.periodoDaManha.visibility == View.VISIBLE &&
                    binding.periodoDaTarde.visibility == View.VISIBLE
                ) {
                    binding.segundaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.tercaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quartaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quintaFeira.background =
                        getDrawable(R.drawable.fundo_tabela_selecionado)
                    binding.sextaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                } else {
                    alterarTodosParaCinza()
                }
            }

            else -> {
                if (binding.periodoDaNoite.visibility == View.VISIBLE &&
                    binding.periodoDaManha.visibility == View.VISIBLE &&
                    binding.periodoDaTarde.visibility == View.VISIBLE
                ) {
                    binding.segundaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.tercaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quartaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.quintaFeira.background =
                        getDrawable(R.drawable.fundo_da_tabela)
                    binding.sextaFeira.background =
                        getDrawable(R.drawable.fundo_tabela_selecionado)
                } else {
                    alterarTodosParaCinza()
                }

            }
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun alterarTodosParaCinza() {

        binding.segundaFeira.background =
            getDrawable(R.drawable.fundo_da_tabela)
        binding.tercaFeira.background =
            getDrawable(R.drawable.fundo_da_tabela)
        binding.quartaFeira.background =
            getDrawable(R.drawable.fundo_da_tabela)
        binding.quintaFeira.background =
            getDrawable(R.drawable.fundo_da_tabela)
        binding.sextaFeira.background =
            getDrawable(R.drawable.fundo_da_tabela)
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