package br.unimes.calc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtTel = findViewById<EditText>(R.id.edt_tel)
        val edtMail = findViewById<EditText>(R.id.edt_mail)
        val edtPix = findViewById<EditText>(R.id.edt_pix)
        val edtIdade = findViewById<EditText>(R.id.edt_idade)
        val btnAtualizar = findViewById<Button>(R.id.btn_atualizar)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)
        val fabVolta= findViewById<FloatingActionButton>(R.id.fab_volta)
        edtNome.setText(intent.getStringExtra("nome_usuario"))


        btnAtualizar.setOnClickListener{
            edtNome.isEnabled= true
            edtTel.isEnabled= true
            edtMail.isEnabled= true
            edtPix.isEnabled= true
            edtIdade.isEnabled= true
        }

        btnSalvar.setOnClickListener{
            edtNome.isEnabled= false
            edtTel.isEnabled= false
            edtMail.isEnabled= false
            edtPix.isEnabled= false
            edtIdade.isEnabled= false
        }

        fabVolta.setOnClickListener{
            finish()
        }

    }
}