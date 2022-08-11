package com.example.facedetectdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Author : Ryans
 * Date : 2022/8/11
 * Introduction :
 */
class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRegist:Button = findViewById(R.id.btn_regist)
        val btnFace:Button = findViewById(R.id.btn_face)
        btnRegist.setOnClickListener(this)
        btnFace.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn_regist ->
                startActivity(Intent(this, RegistActivity::class.java))
            R.id.btn_face ->
                startActivity(Intent(this, DetectActivity::class.java))
        }
    }
}