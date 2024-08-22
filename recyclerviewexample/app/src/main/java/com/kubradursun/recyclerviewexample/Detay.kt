package com.kubradursun.recyclerviewexample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kubradursun.recyclerviewexample.databinding.ActivitylayoutBinding
import com.kubradursun.recyclerviewexample.databinding.DetaylayoutBinding
import com.kubradursun.recyclerviewexample.ui.theme.RecyclerviewexampleTheme

class Detay : ComponentActivity() {
    private lateinit var binding: DetaylayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DetaylayoutBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        val secilenhareket = intent.getSerializableExtra("secilenveri") as Veriler

        binding.hareketText2.setImageResource(secilenhareket.hareketgorseli)



    }

    fun Tikla(view: View) {
        val secilenhareket = intent.getSerializableExtra("secilenveri") as Veriler
        val intent = Intent(this@Detay, Detay2::class.java)
        intent.putExtra("secilenveri2", secilenhareket)
        startActivity(intent)
    }
}
