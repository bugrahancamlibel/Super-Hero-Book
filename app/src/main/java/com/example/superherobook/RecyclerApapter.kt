package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerApapter(val heroList : ArrayList<String>, val heroImages : ArrayList<Int>) : RecyclerView.Adapter<RecyclerApapter.SuperHeroVH>() {
    class SuperHeroVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        // inflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return SuperHeroVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = heroList.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, IntroActivity::class.java)
            intent.putExtra("heroName", heroList.get(position))
            intent.putExtra("heroImage", heroImages.get(position))
            // val singleton = SingletonClass.ChoosenHero
            // singleton.image = heroImages.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return heroList.size
    }


}