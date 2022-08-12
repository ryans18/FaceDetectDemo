package com.example.facedetectdemo

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.webkit.URLUtil
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.facedetectdemo.util.SPUtil

/**
 * Author : Ryans
 * Date : 2022/8/11
 * Introduction :
 */
class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var txtUrl:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRegist:Button = findViewById(R.id.btn_regist)
        val btnFace:Button = findViewById(R.id.btn_face)
        txtUrl = findViewById(R.id.txt_url)
        val url:String? = SPUtil.getString(getString(R.string.API_URL_KEY), this)
        if (url != null) txtUrl.setText(url)
        btnRegist.setOnClickListener(this)
        btnFace.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val url:String = txtUrl.text.toString()
        if (!Patterns.WEB_URL.matcher(url).matches()) {
            Toast.makeText(this, "Url 错误", Toast.LENGTH_SHORT).show()
            return
        }
        when(p0?.id) {
            R.id.btn_regist ->
                startActivity(Intent(this, RegistActivity::class.java))
            R.id.btn_face ->
                startActivity(Intent(this, DetectActivity::class.java))
        }
        SPUtil.putString("API_URL", txtUrl.text.toString(), this.applicationContext)
    }
}