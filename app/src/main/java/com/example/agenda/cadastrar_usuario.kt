package com.example.agenda

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.agenda.databinding.ActivityCadastrarUsuarioBinding

class cadastrar_usuario : AppCompatActivity() {

    private lateinit var binding: ActivityCadastrarUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastrarUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCadastar.setOnClickListener {

            val nome = binding.editName.text.toString()
            val sobrenome = binding.editSobrenome.text.toString()
            val idade = binding.editIdade.text.toString()
            val celular = binding.editCelular.text.toString()

            if (nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty() || celular.isEmpty()) {
                Toast.makeText(this, "Preencher todos os campos!", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(this, "Cadastro concluído com sucesso!", Toast.LENGTH_SHORT).show();
            }

            }
        }
    }

