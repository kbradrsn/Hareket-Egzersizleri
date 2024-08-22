package com.kubradursun.recyclerviewexample

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kubradursun.recyclerviewexample.databinding.RecyclerRowBinding

class HareketAdapter(val veriListesi:ArrayList<Veriler>): RecyclerView.Adapter<HareketAdapter.HareketViewHolder>()   {

    class HareketViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HareketViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HareketViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return veriListesi.size
    }

    override fun onBindViewHolder(holder: HareketViewHolder, position: Int) {
        holder.binding.antremanText.text = veriListesi[position].antreman
        holder.binding.pozisyonText.text = veriListesi[position].hareket
        holder.binding.imageView.setImageResource(veriListesi[position].gorsel)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Detay::class.java)
            intent.putExtra("secilenveri", veriListesi[position])
            holder.itemView.context.startActivity(intent)
        }
    }

}