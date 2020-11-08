package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var face:ImageButton
    lateinit var twi:ImageButton
    lateinit var map:ImageButton
    lateinit var call:ImageButton
    lateinit var mail:ImageButton
    lateinit var git:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            face=findViewById(R.id.fasebook)
        face=findViewById(R.id.fasebook)
        twi=findViewById(R.id.twitter)
        map=findViewById(R.id.googlemap)
        call=findViewById(R.id.callid)
        mail=findViewById(R.id.mailid)
        git=findViewById(R.id.github)

        git.setOnClickListener{

            val sendIntent= Intent().apply {
                action=Intent.ACTION_VIEW
                data= Uri.parse("https://github.com/RasheedHezaber")
            }
            if (sendIntent.resolveActivity(packageManager)!=null){
                startActivity(sendIntent)
            }
        }
        face.setOnClickListener{

            val sendIntent= Intent().apply {
                action=Intent.ACTION_VIEW
                data= Uri.parse("https://www.facebook.com/rasheeed.mohammed.1")
            }
            if (sendIntent.resolveActivity(packageManager)!=null){
                startActivity(sendIntent)
            }
        }
        twi.setOnClickListener{

            val sendIntent= Intent().apply {
                action=Intent.ACTION_VIEW
                data= Uri.parse("https://twitter.com/Rasheed61091536")
            }
            if (sendIntent.resolveActivity(packageManager)!=null){
                startActivity(sendIntent)
            }
        }
        mail.setOnClickListener{
            val addresses = listOf(
                 "rasheedhezaber@gmail.com").toTypedArray()
            val subject = "Some title"
            val text = "Some message\n\nNew Line\n\n"
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                val mailto = "mailto:" + addresses.joinToString(",")
                data = Uri.parse(mailto)
                putExtra(Intent.EXTRA_SUBJECT, subject)
                putExtra(Intent.EXTRA_TEXT, text)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        call.setOnClickListener{
            val sendIntent= Intent().apply {
                action=Intent.ACTION_DIAL
                data= Uri.parse("tel:" + "771011888")
            }
            if (sendIntent.resolveActivity(packageManager)!=null){
                startActivity(sendIntent)
            }


        }
        map.setOnClickListener{
            val sendIntent= Intent().apply {
                action=Intent.ACTION_VIEW
                data= Uri.parse("geo:15.3547531,44.1583763")
            }
            if (sendIntent.resolveActivity(packageManager)!=null){
                startActivity(sendIntent)
            }


        }
    }
}