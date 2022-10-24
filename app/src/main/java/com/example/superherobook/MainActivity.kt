package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superHeroNames = ArrayList<String>()
        superHeroNames.add("Superman")
        superHeroNames.add("Batman")
        superHeroNames.add("Hulk")
        superHeroNames.add("Spiderman")
        superHeroNames.add("Wolverine")

        // bitmaps
        // val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        // val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)

        // var superHeroImages = ArrayList<Bitmap>()
        // superHeroImages.add(supermanBitmap)
        // superHeroImages.add(batmanBitmap)

        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val hulkDrawableId = R.drawable.hulk
        val spidermanDrawableId = R.drawable.spiderman
        val wolverineDrawableId = R.drawable.wolverine


        var superHeroDrawableList = ArrayList<Int>()
        superHeroDrawableList.add(supermanDrawableId)
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(hulkDrawableId)
        superHeroDrawableList.add(spidermanDrawableId)
        superHeroDrawableList.add(wolverineDrawableId)


        //adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val adapter = RecyclerApapter(superHeroNames, superHeroDrawableList)
        recyclerView.adapter = adapter
    }
}