package com.example.kotlinbiodatasederhana

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        githubLink.setOnClickListener { openHyperlink(URLTujuan.GITHUB_PROFILE.LINK) }
        badgeJS.setOnClickListener { openHyperlink(URLTujuan.JAVASCRIPT.LINK) }
        badgeJava.setOnClickListener { openHyperlink(URLTujuan.JAVA.LINK) }
        badgePHP.setOnClickListener { openHyperlink(URLTujuan.PHP.LINK) }
        badgeKotlin.setOnClickListener { openHyperlink(URLTujuan.KOTLIN.LINK) }
        keteranganCard.text="\uD83D\uDCD6 sedang belajar : "

    }

    fun openHyperlink(targetLink:String){
        //ketika targetLink memiliki isi tertentu, maka
        // startActivity dengan menerima url tersebut

        /* Contoh : ketika targetLink berisi konstanta GITHUB_PROFILE, dimana GITHUB_PROFILE punya
        * constructor LINK yang isinya "https\\:github" , maka oper/parse LINK tersebut ke
        * startActivity() */
        when (targetLink) {
            URLTujuan.GITHUB_PROFILE.LINK -> startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(targetLink)))
            URLTujuan.JAVASCRIPT.LINK -> startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(targetLink)))
            URLTujuan.JAVA.LINK -> startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(targetLink)))
            URLTujuan.PHP.LINK -> startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(targetLink)))
            URLTujuan.KOTLIN.LINK -> startActivity(Intent(Intent.ACTION_VIEW,Uri.parse(targetLink)))
        }
    }



}