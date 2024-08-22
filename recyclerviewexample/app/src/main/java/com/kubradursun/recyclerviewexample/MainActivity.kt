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
import androidx.recyclerview.widget.LinearLayoutManager
import com.kubradursun.recyclerviewexample.databinding.ActivitylayoutBinding
import com.kubradursun.recyclerviewexample.ui.theme.RecyclerviewexampleTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivitylayoutBinding
    private lateinit var veriListesi: ArrayList<Veriler>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitylayoutBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        val antreman1= Veriler("Hareket1","Squat",R.drawable.squat, R.drawable.ilkuc,R.drawable.ikinciuc)
        val antreman2= Veriler("Hareket2","Karın", R.drawable.karin,R.drawable.karinbir,R.drawable.kariniki)
        val antreman3= Veriler("Hareket3","Kol",R.drawable.kol,R.drawable.kolbir,R.drawable.koliki)
        val antreman4= Veriler("Hareket4","Bacak",R.drawable.bacak,R.drawable.bacakbir,R.drawable.bacakbir,)
        val antreman5= Veriler("Hareket5","Göğüs",R.drawable.gogus,R.drawable.gogusbir,R.drawable.gogusiki)
        val antreman6= Veriler("Hareket6","Omuz",R.drawable.omuz,R.drawable.omuzbir,R.drawable.omuzbir)
    veriListesi= arrayListOf(antreman1,antreman2,antreman3,antreman4,antreman5,antreman6)

        val adapter= HareketAdapter(veriListesi)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }


}
