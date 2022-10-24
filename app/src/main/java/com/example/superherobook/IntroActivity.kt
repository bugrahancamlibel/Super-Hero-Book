package com.example.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val intent = intent
        val heroName = intent.getStringExtra("heroName")
        textView.text = heroName

        // val choosenHero = SingletonClass.ChoosenHero
        // val choosenImage = choosenHero.image
        // imageView.setImageBitmap(choosenImage)

        val choosenHeroImage = intent.getIntExtra("heroImage", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, choosenHeroImage)
        imageView.setImageBitmap(bitmap)
    }
}