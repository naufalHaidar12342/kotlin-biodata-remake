package com.example.kotlinbiodatasederhana

import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    lateinit var profilePicture:ShapeableImageView
    lateinit var githubLink:Button
    lateinit var keteranganCard:TextView
    lateinit var badgeJS:ImageView
    lateinit var badgePHP:ImageView
    lateinit var badgeJava:ImageView
    lateinit var badgeKotlin:ImageView
    var hyperlink=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* mengaktifkan tampilan dark mode aplikasi
         jika device sedang menggunakan dark mode juga.
         secara standar/by default, akan menggunakan day mode*/
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_KotlinBiodataSederhanaDark)
        }
        setContentView(R.layout.activity_main)

        //
        profilePicture=findViewById(R.id.imgViewProfile)
        githubLink=findViewById(R.id.buttonGithub)
        keteranganCard=findViewById(R.id.tvKeterangan)
        badgeJS=findViewById(R.id.imgViewJS)
        badgeJava=findViewById(R.id.imgViewJava)
        badgeKotlin=findViewById(R.id.imgViewKotlin)
        badgePHP=findViewById(R.id.imgViewPHP)
        //
        profilePicture.setImageResource(R.drawable.image)
        githubLink.setOnClickListener {
            hyperlink="https://github.com/naufalHaidar12342"
            visitGithub(hyperlink)
        }
        badgeJS.setOnClickListener {
            hyperlink="https://www.youtube.com/watch?v=RUTV_5m4VeI&list=PLFIM0718LjIWXagluzROrA-iBY9eeUt4w&index=1"
            aboutJS(hyperlink)
        }
        badgeJava.setOnClickListener {
            hyperlink="https://www.youtube.com/watch?v=d6IIZ6oREcE&list=PLCZlgfAG0GXDUvrO3Bc_VUvIjWKnYIRJ1&index=1"
            aboutJava(hyperlink)
        }
        badgePHP.setOnClickListener {
            hyperlink="https://www.youtube.com/watch?v=l1W2OwV5rgY&list=PLFIM0718LjIUqXfmEIBE3-uzERZPh3vp6"
            aboutPHP(hyperlink)
        }
        badgeKotlin.setOnClickListener {
            hyperlink="https://www.youtube.com/watch?v=_1mQshCwG_8"
            aboutKotlin(hyperlink)
        }
        keteranganCard.text="\uD83D\uDCD6 sedang belajar : "

    }

    fun visitGithub(linkGithub:String){
        startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(linkGithub)))
    }
    fun aboutJS(linkJS:String){
        startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(linkJS)))
    }
    fun aboutJava(linkJava:String){
        startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(linkJava)))
    }
    fun aboutPHP(linkPHP:String){
        startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(linkPHP)))
    }
    fun aboutKotlin(linkKotlin:String){
        startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(linkKotlin)))
    }


}