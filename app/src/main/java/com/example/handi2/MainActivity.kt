package com.example.handi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.handi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val user = User("이름 노출", "주소 노출")

        binding.user2 = user

        var str01 = "#rkrkrkrkrkrk"
        var str02 = "#222222"
        var str03 = "#3333333"


        binding.tvContent.text = str01 + " " + str02 + " " + str03


    }
}
