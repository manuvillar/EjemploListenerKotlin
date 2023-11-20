package es.iesoretania.ejemplolistenerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import es.iesoretania.ejemplolistenerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idboton1.setOnClickListener(this)
        binding.idboton2.setOnClickListener(this)
        binding.idboton3.setOnClickListener(this)
    }

    override fun onClick(v:View){
        val mensaje = when (v.id) {
            R.id.idboton1 -> "Has pulsado el botón 1"
            R.id.idboton2 -> "Has pulsado el botón 2"
            R.id.idboton3 -> "Has pulsado el botón 3"
            else -> "Botón desconocido"
        }
        v.context.toast(mensaje)
    }
}