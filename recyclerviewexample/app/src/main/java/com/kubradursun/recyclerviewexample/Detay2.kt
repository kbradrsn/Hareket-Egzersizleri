package com.kubradursun.recyclerviewexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kubradursun.recyclerviewexample.databinding.Detaylayout2Binding
import com.kubradursun.recyclerviewexample.databinding.DetaylayoutBinding
import com.kubradursun.recyclerviewexample.ui.theme.RecyclerviewexampleTheme

class Detay2 : ComponentActivity() {
    private lateinit var binding: Detaylayout2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Detaylayout2Binding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        val secilenhareketDetay2 = intent.getSerializableExtra("secilenveri2") as Veriler

        binding.imageView2.setImageResource(secilenhareketDetay2.ikincigorsel)
    }
}

